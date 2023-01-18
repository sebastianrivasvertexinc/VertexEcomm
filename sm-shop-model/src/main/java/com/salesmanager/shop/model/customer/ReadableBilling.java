package com.salesmanager.shop.model.customer;

import com.salesmanager.core.business.exception.ConversionException;
import com.salesmanager.shop.model.customer.address.Address;
import com.salesmanager.shop.model.order.ShopOrder;

public class ReadableBilling extends BillingEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ReadableBilling populate(ShopOrder source, Address ad) throws ConversionException {


		ReadableBilling address = new ReadableBilling();
		if (source.getCustomer().getBilling() != null) {

			address.setEmail(source.getCustomer().getEmailAddress());
			address.setCity(source.getCustomer().getBilling().getCity());
			address.setAddress(source.getCustomer().getBilling().getAddress());
			address.setCompany(source.getCustomer().getBilling().getCompany());
			address.setFirstName(source.getCustomer().getBilling().getFirstName());
			address.setLastName(source.getCustomer().getBilling().getLastName());
			address.setPostalCode(source.getCustomer().getBilling().getPostalCode());
			address.setPhone(source.getCustomer().getBilling().getPhone());
			if (source.getCustomer().getBilling().getCountry() != null) {
				address.setCountry(source.getCustomer().getBilling().getCountryCode());
			}
			if (source.getCustomer().getBilling().getZone() != null) {
				address.setZone(source.getCustomer().getBilling().getZone());
			}
			if (source.getCustomer().getBilling().getIsVatValid()!= null) {
				address.setIsVatValid(source.getCustomer().getBilling().getIsVatValid());
			}
			if (source.getCustomer().getBilling().getVatNumber()!= null) {
				address.setVatNumber(source.getCustomer().getBilling().getVatNumber());
			}

			}


		return address;
	}
}