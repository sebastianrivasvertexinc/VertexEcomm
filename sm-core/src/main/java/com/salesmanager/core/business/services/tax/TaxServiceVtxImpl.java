package com.salesmanager.core.business.services.tax;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.salesmanager.core.business.exception.ServiceException;
import com.salesmanager.core.business.services.system.MerchantConfigurationService;
import com.salesmanager.core.business.services.tax.taxamo.VatValidate;
import com.salesmanager.core.business.services.tax.vertex.*;
import com.salesmanager.core.model.catalog.product.description.ProductDescription;
import com.salesmanager.core.model.customer.Customer;
import com.salesmanager.core.model.merchant.MerchantStore;
import com.salesmanager.core.model.order.Order;
import com.salesmanager.core.model.order.OrderSummary;
import com.salesmanager.core.model.order.OrderTotal;
import com.salesmanager.core.model.order.OrderTotalSummary;
import com.salesmanager.core.model.order.orderproduct.OrderProduct;
import com.salesmanager.core.model.reference.country.Country;
import com.salesmanager.core.model.reference.language.Language;
import com.salesmanager.core.model.reference.zone.Zone;
import com.salesmanager.core.model.shipping.ShippingSummary;
import com.salesmanager.core.model.shoppingcart.ShoppingCartItem;
import com.salesmanager.core.model.system.MerchantConfiguration;
import com.salesmanager.core.model.tax.TaxConfiguration;
import com.squareup.okhttp.*;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

@Service("taxServiceVtx")
public class  TaxServiceVtxImpl
		implements TaxServiceVtx {
	
	private final static String TAX_CONFIGURATION = "TAX_CONFIG";
	private final static String DEFAULT_TAX_CLASS = "DEFAULT";

	private String client_Id = "";
	private String client_secret = "";
	private String calc_url = "";
	private String taxamoValidationURL  = "";
	private String taxamoAuthToken = "";
	@Inject
	private MerchantConfigurationService merchantConfigurationService;
	
	@Inject
	private TaxRateService taxRateService;
	
	@Inject
	private TaxClassService taxClassService;
	
	@Override
	public TaxConfiguration getTaxConfiguration(MerchantStore store) throws ServiceException {
		
		
		
		MerchantConfiguration configuration = merchantConfigurationService.getMerchantConfiguration(TAX_CONFIGURATION, store);
		TaxConfiguration taxConfiguration = null;
		if(configuration!=null) {
			String value = configuration.getValue();
			
			ObjectMapper mapper = new ObjectMapper();
			try {
				taxConfiguration = mapper.readValue(value, TaxConfiguration.class);
			} catch(Exception e) {
				throw new ServiceException("Cannot parse json string " + value);
			}
		}


		return taxConfiguration;
	}
	
	
	@Override
	public void saveTaxConfiguration(TaxConfiguration shippingConfiguration, MerchantStore store) throws ServiceException {
		
		MerchantConfiguration configuration = merchantConfigurationService.getMerchantConfiguration(TAX_CONFIGURATION, store);

		if(configuration==null) {
			configuration = new MerchantConfiguration();
			configuration.setMerchantStore(store);
			configuration.setKey(TAX_CONFIGURATION);
		}
		
		String value = shippingConfiguration.toJSONString();
		configuration.setValue(value);
		merchantConfigurationService.saveOrUpdate(configuration);
		
	}


	@Override
	public VtxTaxCalc calculateTax(OrderSummary orderSummary, Customer customer, MerchantStore store, Language language) throws ServiceException {


		if(customer==null) {
			return null;
		}

		//set all the config information
		TaxConfiguration taxConfiguration = taxService.getTaxConfiguration(store);
		if(taxConfiguration == null) {
		throw new ServiceException("error getting taxConfig in Vertex Tax Calculation");
		}

		this.client_Id = taxConfiguration.getTaxCalcClientId();
		this.client_secret = taxConfiguration.getTaxCalcClientSecret();
		this.calc_url = taxConfiguration.getTaxCalcURL();
		this.taxamoValidationURL = taxConfiguration.getTaxamoValidationURL();
		this.taxamoAuthToken = taxConfiguration.getTaxamoAuthToken();


		//List<TaxItem> taxLines = new ArrayList<TaxItem>();
		List<ShoppingCartItem> items = orderSummary.getProducts();
		Boolean validVAT=false;
		if(items==null) {
			return null;
		}


		Country country = customer.getBilling().getCountry();
		Zone zone = customer.getBilling().getZone();
		String stateProvince = customer.getBilling().getState();


		if(zone == null && StringUtils.isBlank(stateProvince)) {
			return null;
		}
//vtx begin

		VtxTaxCalc vtxEngineCalculation=new VtxTaxCalc();
		VtxTaxCalcReq calcRequest=new VtxTaxCalcReq();
		String 	accessToken = "";
		try {
			accessToken = getAuthentication(this.client_Id, this.client_secret);
			Date date = Calendar.getInstance().getTime();
			DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");
			String strDate = dateFormat.format(date);
			calcRequest.setDocumentDate(strDate);
			calcRequest.setSaleMessageType("QUOTATION");
			calcRequest.setTransactionType("SALE");
			Seller seller = new Seller();
			seller.company=store.getStorename();

			PhysicalOrigin physicalOrigin= new PhysicalOrigin();
			if 	(!StringUtils.isBlank(store.getStorecity()))
				physicalOrigin.city=store.getStorecity();
			if 	(store.getZone().getCode()!=null)
				physicalOrigin.mainDivision=store.getZone().getCode();
			if 	(!StringUtils.isBlank(store.getStoreaddress()))
				physicalOrigin.streetAddress1=store.getStoreaddress();
			if 	(!StringUtils.isBlank(store.getCountry().getIsoCode()))
				physicalOrigin.country= store.getCountry().getIsoCode();
			if	(!StringUtils.isBlank(store.getStorepostalcode()))
				physicalOrigin.postalCode=store.getStorepostalcode();

		//	seller.physicalOrigin=physicalOrigin;//TODO, need to find a way to allow this value to be an option from the UI
			calcRequest.setSeller(seller);

			com.salesmanager.core.business.services.tax.vertex.Customer cust = new com.salesmanager.core.business.services.tax.vertex.Customer();
			CustomerCode custCode=new CustomerCode();
			custCode.value	=customer.getEmailAddress();

			if	(!StringUtils.isBlank(customer.getBilling().getVatNumber()))
			try {
				validVAT = doVatValidation(customer.getBilling().getVatNumber(), store);
				customer.getBilling().setIsVatValid(String.valueOf(validVAT)); //setting VAT is true or false and storing
			}
			catch (Exception e)
			{
				//If it fails on Service dont worry about error yet...
			}




			cust.customerCode=custCode;
		/*	if (validVAT==Boolean.TRUE)//TODO need to make sure this logic is valid for US
				cust.isTaxExempt= true;*/
			Destination destination= new Destination();
			if	(!StringUtils.isBlank(customer.getBilling().getCity()))
				destination.city=customer.getBilling().getCity();
			if 	(!StringUtils.isBlank(customer.getBilling().getState()))
				destination.mainDivision=customer.getBilling().getState();
			if 	(!StringUtils.isBlank(customer.getBilling().getAddress()))
				destination.streetAddress1=customer.getBilling().getAddress();
			if 	(!StringUtils.isBlank(customer.getBilling().getCountry().getIsoCode()))
				destination.country= customer.getBilling().getCountry().getIsoCode();
			if 	(!StringUtils.isBlank(customer.getBilling().getPostalCode()))
				destination.postalCode=customer.getBilling().getPostalCode();
			cust.destination=destination;

			cust.taxRegistrations = new ArrayList<TaxRegistration>();
			TaxRegistration tr = new TaxRegistration();
			if (validVAT){ // only set when VAT is valid.
				tr.setTaxRegistrationNumber(customer.getBilling().getVatNumber()); //modified to get VAT number from front page
				tr.setIsoCountryCode(customer.getBilling().getCountry().getIsoCode());
				cust.customerCode.isBusinessIndicator=true;
			}
			cust.taxRegistrations.add(tr)		;

			calcRequest.setCustomer(cust);

			ArrayList<LineItem> itemsVtx=new ArrayList<LineItem>();
			int i = 0; // to use for iteration for Product Descriptions to handle language

			for (ShoppingCartItem it :orderSummary.getProducts())
			{
				LineItem itVtx=new LineItem();
				itVtx.extendedPrice=it.getSubTotal();
				itVtx.unitPrice=it.getItemPrice();
				itVtx.quantity=new Quantity();
				itVtx.quantity.value=it.getQuantity();
				itVtx.product=new Product();

				// to Resolve issue of Hibernate / DB2 data not being sorted with languages, test store language then apply
				// correct language product in Object

				for(ProductDescription desc : orderSummary.getProducts().get(i).getProduct().getDescriptions())
				{
					if(language.getCode() == desc.getLanguage().getCode())
					{
						itVtx.product.productClass=desc.getName();
					}
				}

				if (it.getProduct().getSku()!=null)
					itVtx.product.value= it.getProduct().getSku();

				//replacing this code as it can flip the language

				//if (it.getProduct().getProductDescription()!=null)
				//	itVtx.product.productClass=it.getProduct().getProductDescription().getName();

				itemsVtx.add(itVtx);

				i++;
			}

			//ADD SHIPPING
			BigDecimal shippingAmnt = new BigDecimal(0);
			if(shippingAmnt==null) {
				shippingAmnt = new BigDecimal(0);
				shippingAmnt.setScale(2, RoundingMode.HALF_UP);
			}
			ShippingSummary shippingSummary = orderSummary.getShippingSummary();
			if(shippingSummary!=null && shippingSummary.getShipping()!=null && shippingSummary.getShipping().doubleValue()>0) {
				shippingAmnt = shippingAmnt.add(shippingSummary.getShipping());
				if(shippingSummary.getHandling()!=null && shippingSummary.getHandling().doubleValue()>0) {
					shippingAmnt = shippingAmnt.add(shippingSummary.getHandling());
				}
			}
			LineItem itVtx=new LineItem();
			itVtx.extendedPrice=shippingAmnt;
			itVtx.unitPrice=shippingAmnt;
			itVtx.quantity=new Quantity();
			itVtx.quantity.value=1;
			itVtx.product=new Product();
			itVtx.product.value= "SHIPPING";
			itVtx.product.productClass="SHIPPING";
			itemsVtx.add(itVtx);
			//SHIPPING ADDED

			calcRequest.setLineItems(itemsVtx);

			vtxEngineCalculation=this.doCalculation(calcRequest,accessToken, this.calc_url);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

//vtx end
		if (vtxEngineCalculation==null || vtxEngineCalculation.data==null || vtxEngineCalculation.data.getlineItems()==null || vtxEngineCalculation.data.getlineItems().isEmpty()){
			return null;
		}
		//List<TaxItem> taxItems = new ArrayList<TaxItem>();
		//put items in a map by tax class id
		//int itenCont=0;
		return vtxEngineCalculation;


	}
	public ArrayList<LineItem> commitTax(Order order, Customer customer, MerchantStore store, OrderTotalSummary summary)throws ServiceException {

		//set all the config information
		TaxConfiguration taxConfiguration = taxService.getTaxConfiguration(store);
		if(taxConfiguration == null) {
			throw new ServiceException("error getting taxConfig in Vertex Tax Calculation");
		}

		this.client_Id = taxConfiguration.getTaxCalcClientId();
		this.client_secret = taxConfiguration.getTaxCalcClientSecret();
		this.calc_url = taxConfiguration.getTaxCalcURL();
		this.taxamoValidationURL = taxConfiguration.getTaxamoValidationURL();
		this.taxamoAuthToken = taxConfiguration.getTaxamoAuthToken();

		Set<OrderProduct> items = order.getOrderProducts();
		Boolean validVAT=false;
		if(items==null) {
			return null;
		}

		Country country = customer.getBilling().getCountry();
		Zone zone = customer.getBilling().getZone();
		String stateProvince = customer.getBilling().getState();

		if(zone == null && StringUtils.isBlank(stateProvince)) {
			return null;
		}

		VtxTaxCalc vtxEngineCalculation=new VtxTaxCalc();
		VtxTaxCalcReq calcRequest=new VtxTaxCalcReq();
		String 	accessToken = "";
		try {
			accessToken = getAuthentication(this.client_Id, this.client_secret);
			Date date = Calendar.getInstance().getTime();
			DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");
			String strDate = dateFormat.format(date);
			calcRequest.setDocumentDate(strDate);
			calcRequest.setSaleMessageType("INVOICE");
			calcRequest.setTransactionType("SALE");
			Seller seller = new Seller();
			seller.company=store.getStorename();

			PhysicalOrigin physicalOrigin= new PhysicalOrigin();
			if 	(!StringUtils.isBlank(store.getStorecity()))
				physicalOrigin.city=store.getStorecity();
			if 	(store.getZone().getCode()!=null)
				physicalOrigin.mainDivision=store.getZone().getCode();
			if 	(!StringUtils.isBlank(store.getStoreaddress()))
				physicalOrigin.streetAddress1=store.getStoreaddress();
			if 	(!StringUtils.isBlank(store.getCountry().getIsoCode()))
				physicalOrigin.country= store.getCountry().getIsoCode();
			if	(!StringUtils.isBlank(store.getStorepostalcode()))
				physicalOrigin.postalCode=store.getStorepostalcode();

		//	seller.physicalOrigin=physicalOrigin; //TODO need to add a logic for ship from, now the value is null.
			calcRequest.setSeller(seller);

			com.salesmanager.core.business.services.tax.vertex.Customer cust = new com.salesmanager.core.business.services.tax.vertex.Customer();
			CustomerCode custCode=new CustomerCode();
			custCode.value	=customer.getEmailAddress();



			if	(!StringUtils.isBlank(customer.getBilling().getVatNumber())) // perform VAT ID Validation if it is not valid do not add it to the registration.
				try {
					validVAT = doVatValidation(customer.getBilling().getVatNumber(), store);
					customer.getBilling().setIsVatValid(String.valueOf(validVAT)); //setting VAT is true or false and storing
				}
				catch (Exception e)
				{
					//If it fails on Service dont worry about error yet...
				}



			cust.customerCode=custCode;
			Destination destination= new Destination();
			if	(!StringUtils.isBlank(customer.getBilling().getCity()))
				destination.city=customer.getBilling().getCity();
			if 	(!StringUtils.isBlank(customer.getBilling().getState()))
				destination.mainDivision=customer.getBilling().getState();
			if 	(!StringUtils.isBlank(customer.getBilling().getAddress()))
				destination.streetAddress1=customer.getBilling().getAddress();
			if 	(!StringUtils.isBlank(customer.getBilling().getCountry().getIsoCode()))
				destination.country= customer.getBilling().getCountry().getIsoCode();
			if 	(!StringUtils.isBlank(customer.getBilling().getPostalCode()))
				destination.postalCode=customer.getBilling().getPostalCode();
			cust.destination=destination;

			cust.taxRegistrations = new ArrayList<TaxRegistration>();
			TaxRegistration tr = new TaxRegistration();
			if(validVAT){
				tr.setTaxRegistrationNumber(customer.getBilling().getVatNumber()); //modified to get VAT number from front page
				tr.setIsoCountryCode(customer.getBilling().getCountry().getIsoCode());
				cust.customerCode.isBusinessIndicator=true;
			}
			cust.taxRegistrations.add(tr)		;
			calcRequest.setCustomer(cust);

			ArrayList<LineItem> itemsVtx=new ArrayList<LineItem>();

			for (OrderProduct it :order.getOrderProducts())
			{
				LineItem itVtx=new LineItem();

				itVtx.extendedPrice=it.getOneTimeCharge();
				itVtx.quantity=new Quantity();
				itVtx.quantity.value=it.getProductQuantity();
				itVtx.product=new Product();
				if (it.getSku()!=null)
					itVtx.product.value= it.getSku();
				if (it.getProductName()!=null)
					itVtx.product.productClass=it.getProductName();
				itemsVtx.add(itVtx);

			}

			//ADD SHIPPING
			LineItem itVtx=new LineItem();
			for(OrderTotal tot:summary.getTotals()){
				if (tot.getOrderTotalCode().equals("order.total.shipping"))
				{
					itVtx.extendedPrice=tot.getValue();
					itVtx.quantity=new Quantity();
					itVtx.quantity.value=1;
					itVtx.product=new Product();
					itVtx.product.value= tot.getModule();
					itVtx.product.productClass=tot.getOrderTotalType().name();
					itemsVtx.add(itVtx);
				}
			}
			//SHIPPING ADDED

			calcRequest.setLineItems(itemsVtx);

			vtxEngineCalculation=this.doCalculation(calcRequest,accessToken, this.calc_url);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

		//vtx end


		if (vtxEngineCalculation==null || vtxEngineCalculation.data==null || vtxEngineCalculation.data.getlineItems()==null || vtxEngineCalculation.data.getlineItems().isEmpty()){
			return null;
		}

		return vtxEngineCalculation.data.getlineItems();
	};
	@Inject
	private TaxService taxService = null;
	private Boolean doVatValidation(String taxRegistrationNumber, MerchantStore store) throws Exception {


		Gson gson = new Gson();
		OkHttpClient client = new OkHttpClient();
		MediaType mediaType = MediaType.parse("application/json");
		RequestBody body = RequestBody.create(mediaType, "");
		Request request = new Request.Builder()
				.url(this.taxamoValidationURL + "/tax/vat_numbers/"+taxRegistrationNumber+"/validate")
				.get()
				.addHeader("Content-Type", "application/json")
				.addHeader("Private-Token", this.taxamoAuthToken)
				.build();

		Response response = client.newCall(request).execute();
		VatValidate taxamovatvalidate=new VatValidate();
		String jsonData = response.body().string();

		taxamovatvalidate=gson.fromJson(jsonData,VatValidate.class);
		System.out.println(jsonData);
		return taxamovatvalidate.getBuyer_tax_number_valid();
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

	public static VtxTaxCalc doCalculation(VtxTaxCalcReq calcRequest, String accessToken, String calc_url) throws IOException {
		Gson gson = new Gson();
		OkHttpClient client = new OkHttpClient();
		MediaType mediaType = MediaType.parse("application/json");
		String jsonDataReq=gson.toJson(calcRequest,VtxTaxCalcReq.class);
		RequestBody body = RequestBody.create(mediaType, jsonDataReq);

		Request request = new Request.Builder()
				.url(calc_url )
				.method("POST", body)
				.addHeader("Content-Type", "application/json")
				.addHeader("Authorization", "Bearer "+accessToken)
				.build();
		Response response = client.newCall(request).execute();;


		VtxTaxCalc vtx=new VtxTaxCalc();
		String jsonData = response.body().string();

		vtx=gson.fromJson(jsonData,VtxTaxCalc.class);
		return vtx;
	}








}
