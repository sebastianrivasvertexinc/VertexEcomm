package com.salesmanager.core.model.tax;

import org.json.simple.JSONAware;
import org.json.simple.JSONObject;

/**
 * Set of various tax configuration settings saved in MerchantConfiguration
 * @author carl samson
 *
 */
public class TaxConfiguration implements JSONAware {
	
	private TaxBasisCalculation taxBasisCalculation = TaxBasisCalculation.SHIPPINGADDRESS;
	
	private boolean collectTaxIfDifferentProvinceOfStoreCountry = true;
	private boolean collectTaxIfDifferentCountryOfStoreCountry = false;

	// Made some changes to the taxconfiguration toJSONString call to capture additonal persistence data fields = Dave Read
	@SuppressWarnings("unchecked")
	@Override
	public String toJSONString() {
		JSONObject data = new JSONObject();
		data.put("taxBasisCalculation", this.getTaxBasisCalculation().name());
		data.put("taxCalcURL",this.taxCalcURL);
		data.put("taxCalcClientId", this.taxCalcClientId);
		data.put("taxCalcClientSecret", this.taxCalcClientSecret);
		data.put("taxEinvURL",this.taxEinvURL);
		data.put("taxEinvClientId",this.taxEinvClientId);
		data.put("taxEinvClientSecret", this.taxEinvClientSecret);
		data.put("taxamoValidationURL", this.taxamoValidationURL);
		data.put("taxamoAuthToken", this.taxamoAuthToken);
		data.put("taxAuthURL", this.authenticationURL);

		
		return data.toJSONString();
	}

	public void setTaxBasisCalculation(TaxBasisCalculation taxBasisCalculation) {
		this.taxBasisCalculation = taxBasisCalculation;
	}

	public TaxBasisCalculation getTaxBasisCalculation() {
		return taxBasisCalculation;
	}

	public void setCollectTaxIfDifferentProvinceOfStoreCountry(
			boolean collectTaxIfDifferentProvinceOfStoreCountry) {
		this.collectTaxIfDifferentProvinceOfStoreCountry = collectTaxIfDifferentProvinceOfStoreCountry;
	}

	public boolean isCollectTaxIfDifferentProvinceOfStoreCountry() {
		return collectTaxIfDifferentProvinceOfStoreCountry;
	}

	public void setCollectTaxIfDifferentCountryOfStoreCountry(
			boolean collectTaxIfDifferentCountryOfStoreCountry) {
		this.collectTaxIfDifferentCountryOfStoreCountry = collectTaxIfDifferentCountryOfStoreCountry;
	}

	public boolean isCollectTaxIfDifferentCountryOfStoreCountry() {
		return collectTaxIfDifferentCountryOfStoreCountry;
	}


	//Used to get and set the URL configuration data from the front end JSP page: David Read
	// Will need to store values to communicate to Vertex and Taxamo URLs

	public String taxCalcURL = "This value is the Calc Vertex O Series URL";
	public String getTaxCalcURL()
	{
		return this.taxCalcURL ;
	}
	public void setTaxCalcURL(String taxcalcurl) {
		this.taxCalcURL = taxcalcurl;
	}

	public String taxCalcClientId = "This value is the Calc Vertex O Series Client Id";
	public String getTaxCalcClientId()
	{
		return this.taxCalcClientId ;
	}
	public void setTaxCalcClientId(String tccid) {
		this.taxCalcClientId  = tccid;
	}

	public String taxCalcClientSecret = "This value is the Calc Vertex O Series Client Secret";
	public String getTaxCalcClientSecret()
	{
		return this.taxCalcClientSecret;
	}
	public void setTaxCalcClientSecret(String tccsec) {
		this.taxCalcClientSecret  = tccsec;
	}
	public String taxAdminURL =  "";
	public String taxAdminClientId =  "";
	public String taxAdminClientSecret =  "";
	public String taxEinvURL =  "This value is the Envoicing Vertex O Series URL";	// should have a function to read from DB or persistence file
	public String getTaxEinvURL()
	{
		return this.taxEinvURL ;
	}
	public void setTaxEinvURL(String taxadminurl) {
		this.taxEinvURL = taxadminurl;
	}

	public String taxEinvClientId =  "This value is the Envoicing Vertex O Series Client Id";	// should have a function to read from DB or persistence file
	public String getTaxEinvClientId()
	{
		return this.taxEinvClientId ;
	}
	public void setTaxEinvClientId(String tacid) {
		this.taxEinvClientId = tacid;
	}

	public String taxEinvClientSecret =  "This value is the Envoicing Vertex O Series Client Secret";	// should have a function to read from DB or persistence file
	public String getTaxEinvClientSecret()
	{
		return this.taxEinvClientSecret ;
	}
	public void setTaxEinvClientSecret(String tacsec) {
		this.taxEinvClientSecret = tacsec;
	}

	public String taxamoValidationURL =  "This value is the Taxamo Validation URL";	// should have a function to read from DB or persistence file
	public String getTaxamoValidationURL()
	{
		return this.taxamoValidationURL ;
	}
	public void setTaxamoValidationURL(String txurl) {
		this.taxamoValidationURL = txurl;
	}

	public String taxamoAuthToken =  "This value is the Taxamo Auth Token";	// should have a function to read from DB or persistence file
	public String getTaxamoAuthToken()
	{
		return this.taxamoAuthToken ;
	}
	public void setTaxamoAuthToken(String txat) {
		this.taxamoAuthToken = txat;
	}

	public String authenticationURL =  "This value is the Auth URL for Vertex Solutions";
	public String getTaxAuthURL()
	{
		return this.authenticationURL ;
	}
	public void setTaxAuthURL(String auth) {
		this.authenticationURL = auth;
	}
}
