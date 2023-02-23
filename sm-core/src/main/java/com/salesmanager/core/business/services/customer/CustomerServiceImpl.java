package com.salesmanager.core.business.services.customer;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.inject.Inject;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import com.salesmanager.core.business.services.tax.TaxServiceVtxImpl;
import com.salesmanager.core.business.services.tax.taxAreaLookup.AddressCleansingReq;
import com.salesmanager.core.business.services.tax.taxAreaLookup.AddressCleansingResp;
import com.salesmanager.core.business.services.tax.taxAreaLookup.AddressResp;
import com.salesmanager.core.business.services.tax.taxAreaLookup.PostalAddress;
import com.salesmanager.core.model.common.Billing;
import com.salesmanager.core.model.common.Delivery;
import com.squareup.okhttp.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.salesmanager.core.business.exception.ServiceException;
import com.salesmanager.core.business.repositories.customer.CustomerRepository;
import com.salesmanager.core.business.services.common.generic.SalesManagerEntityServiceImpl;
import com.salesmanager.core.business.services.customer.attribute.CustomerAttributeService;
import com.salesmanager.core.model.common.Address;
import com.salesmanager.core.model.customer.Customer;
import com.salesmanager.core.model.customer.CustomerCriteria;
import com.salesmanager.core.model.customer.CustomerList;
import com.salesmanager.core.model.customer.attribute.CustomerAttribute;
import com.salesmanager.core.model.merchant.MerchantStore;
import com.salesmanager.core.modules.utils.GeoLocation;



@Service("customerService")
public class CustomerServiceImpl extends SalesManagerEntityServiceImpl<Long, Customer> implements CustomerService {

	private static final Logger LOGGER = LoggerFactory.getLogger(CustomerServiceImpl.class);
	
	private CustomerRepository customerRepository;
	
	@Inject
	private CustomerAttributeService customerAttributeService;
	
	@Inject
	private GeoLocation geoLocation;

	
	@Inject
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		super(customerRepository);
		this.customerRepository = customerRepository;
	}

	@Override
	public List<Customer> getByName(String firstName) {
		return customerRepository.findByName(firstName);
	}
	
	@Override
	public Customer getById(Long id) {
			return customerRepository.findOne(id);		
	}
	
	@Override
	public Customer getByNick(String nick) {
		return customerRepository.findByNick(nick);	
	}
	
	@Override
	public Customer getByNick(String nick, int storeId) {
		return customerRepository.findByNick(nick, storeId);	
	}
	
	@Override
	public List<Customer> getListByStore(MerchantStore store) {
		return customerRepository.findByStore(store.getId());
	}
	
	@Override
	public CustomerList getListByStore(MerchantStore store, CustomerCriteria criteria) {
		return customerRepository.listByStore(store,criteria);
	}
	
	@Override
	public Address getCustomerAddress(MerchantStore store, String ipAddress) throws ServiceException {
		
		try {
			return geoLocation.getAddress(ipAddress);
		} catch(Exception e) {
			throw new ServiceException(e);
		}
		
	}

	@Override	
	public void saveOrUpdate(Customer customer) throws ServiceException {

		LOGGER.debug("Creating Customer");
		//customer= taxService.commitTax(order, customer, store,summary);
		customer= cleanseAddress(customer);
		if(customer.getId()!=null && customer.getId()>0) {
			super.update(customer);
		} else {			
		
			super.create(customer);

		}
	}
	private TaxServiceVtxImpl taxServiceVtx = null;
	private Customer cleanseAddress(Customer customer) {

		TaxServiceVtxImpl taxServiceVtx =new TaxServiceVtxImpl();
		try {
			customer.setBilling(cleanseBillingAddress(customer.getBilling()));
			customer.setDelivery(cleanseDeliveryAddress(customer.getDelivery()));
		} catch (ServiceException e) {
			throw new RuntimeException(e);
		}
		return customer;
	}
	public static AddressCleansingResp doAddressCleansing(AddressCleansingReq taxAreaLookupReq, String accessToken, String taxAreaLookupURL) throws IOException {
		Gson gson = new Gson();
		OkHttpClient client = new OkHttpClient();
		MediaType mediaType = MediaType.parse("application/json");
		String jsonDataReq=gson.toJson(taxAreaLookupReq, AddressCleansingReq.class);
		RequestBody body = RequestBody.create(mediaType, jsonDataReq);

		Request request = new Request.Builder()
				.url(taxAreaLookupURL + "/vertex-ws/v2/address-lookup")
				.method("POST", body)
				.addHeader("Content-Type", "application/json")
				.addHeader("Authorization", "Bearer "+accessToken)
				.build();
		Response response = client.newCall(request).execute();;


		AddressCleansingResp addressCleansingResp=new AddressCleansingResp();
		String jsonData = response.body().string();

		addressCleansingResp=gson.fromJson(jsonData,AddressCleansingResp.class);
		return addressCleansingResp;
	}


	public static String getAuthentication(String client_Id, String client_secret) throws IOException {

		OkHttpClient client = new OkHttpClient();
		MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded");
		RequestBody body = RequestBody.create(mediaType, "client_id=" + client_Id + "&client_secret=" + client_secret +"&grant_type=client_credentials&scope=calc-rest-api");
		Request request = new Request.Builder()
				.url("https://auth.vertexsmb.com/identity/connect/token")//TODO: david add this to tha admin console as "Vertex Autentication URL"
				.method("POST", body)
				.addHeader("Content-Type", "application/x-www-form-urlencoded")
				.build();
		Response response = client.newCall(request).execute();

		Map<String, Object> responseMap = new ObjectMapper().readValue(response.body().byteStream(), HashMap.class);
		// Read the value of the "access_token" key from the hashmap
		String accessToken = (String) responseMap.get("access_token");
		return accessToken;

	}
	public Billing cleanseBillingAddress(Billing billing) throws ServiceException {
		if (billing ==null)
			return null;
		if (!billing.getCountry().getIsoCode().equals("US"))
			return billing;

		String token="";
		AddressCleansingReq taxAreaLookupReq= new AddressCleansingReq();
		PostalAddress postalAddress=new PostalAddress();
		postalAddress.setStreetAddress1(billing.getAddress());
		postalAddress.setPostalCode(billing.getPostalCode());
		postalAddress.setCity(billing.getCity());
		postalAddress.setMainDivision(billing.getState());
		postalAddress.setCountry(billing.getCountry().getName());
		taxAreaLookupReq.setPostalAddress(postalAddress);

		Date date = Calendar.getInstance().getTime();
		DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");
		String strDate = dateFormat.format(date);
		taxAreaLookupReq.setAsOfDate(strDate);
		AddressCleansingResp resp=new AddressCleansingResp();
		try {
			token=getAuthentication("bc525a9fce454a039a0346c258ecfed1","5bfdc36e670b4e0986e0d79ddae063eb");//TODO
			resp=doAddressCleansing(taxAreaLookupReq,
					token,
					"https://calcconnect.vertexsmb.com");//TODO
		} catch (IOException e) {
			return billing;
		}

		if (resp.getData()!=null)
		for (AddressResp result : resp.getData().lookupResults){
			for (PostalAddress address :  result.getPostalAddresses()) {
				billing.setAddress(address.getStreetAddress1());
				billing.setCity(address.getCity());
				billing.setState(address.getMainDivision());
				billing.setPostalCode(address.getPostalCode());
			}
		};
		return billing;
	};
	public Delivery cleanseDeliveryAddress(Delivery delivery) throws ServiceException {

		String token="";
		if (delivery ==null)
			return null;
		if (!delivery.getCountry().getIsoCode().equals("US"))
			return delivery;

		AddressCleansingReq taxAreaLookupReq= new AddressCleansingReq();
		PostalAddress postalAddress=new PostalAddress();
		postalAddress.setStreetAddress1(delivery.getAddress());
		postalAddress.setPostalCode(delivery.getPostalCode());
		postalAddress.setCity(delivery.getCity());
		postalAddress.setMainDivision(delivery.getState());
		postalAddress.setCountry(delivery.getCountry().getName());
		taxAreaLookupReq.setPostalAddress(postalAddress);

		Date date = Calendar.getInstance().getTime();
		DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");
		String strDate = dateFormat.format(date);
		taxAreaLookupReq.setAsOfDate(strDate);
		AddressCleansingResp resp=new AddressCleansingResp();
		try {
			token=getAuthentication("adff60ffbf2446ba939e710724403578","517afb367d17461887301fb4b228ae3a");//TODO David need to use UI clliet ID and Secret

			resp=doAddressCleansing(taxAreaLookupReq,
					token,
					"https://calcconnect.vertexsmb.com");//TODO David need to use URL from the UI
		} catch (IOException e) {
			return delivery;
		}

		if (resp.getData()!=null)
			for (AddressResp result : resp.getData().lookupResults){
				for (PostalAddress address :  result.getPostalAddresses()) {
					delivery.setAddress(address.getStreetAddress1());
					delivery.setCity(address.getCity());
					delivery.setState(address.getMainDivision());
					delivery.setPostalCode(address.getPostalCode());
				}
			};
		return delivery;
	};

	public void delete(Customer customer) throws ServiceException {
		customer = getById(customer.getId());
		
		//delete attributes
		List<CustomerAttribute> attributes =customerAttributeService.getByCustomer(customer.getMerchantStore(), customer);
		if(attributes!=null) {
			for(CustomerAttribute attribute : attributes) {
				customerAttributeService.delete(attribute);
			}
		}
		customerRepository.delete(customer);

	}

	@Override
	public Customer getByNick(String nick, String code) {
		return customerRepository.findByNick(nick, code);
	}

	@Override
	public Customer getByPasswordResetToken(String storeCode, String token) {
		return customerRepository.findByResetPasswordToken(token, storeCode);
	}
	

}
