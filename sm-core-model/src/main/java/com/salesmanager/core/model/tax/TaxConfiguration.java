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
		data.put("taxAdminURL",this.taxAdminURL);
		data.put("taxAdminClientId",this.taxAdminClientId);
		data.put("taxAdminClientSecret", this.taxAdminClientSecret);
		data.put("taxamoValidationURL", this.taxamoValidationURL);
		data.put("taxamoAuthToken", this.taxamoAuthToken);

		
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
	//public String taxCalcURL =  getTaxCalcURL(); // should have a function to read from DB or persistence file
	public String getTaxCalcURL()
	{
		return this.taxCalcURL ;
	}
	public void setTaxCalcURL(String taxcalcurl) {
		this.taxCalcURL = taxcalcurl;
	}

	public String taxCalcClientId = "This value is the Calc Vertex O Series Client Id";
	//public String taxCalcClientId =  getTaxCalcClientId(); // should have a function to read from DB or persistence file
	public String getTaxCalcClientId()
	{
		return this.taxCalcClientId ;
	}
	public void setTaxCalcClientId(String tccid) {
		this.taxCalcClientId  = tccid;
	}

	public String taxCalcClientSecret = "This value is the Calc Vertex O Series Client Secret";
	//public String taxCalcClientSecret =  getTaxCalcClientSecret(); // should have a function to read from DB or persistence file
	public String getTaxCalcClientSecret()
	{
		return this.taxCalcClientSecret;
	}
	public void setTaxCalcClientSecret(String tccsec) {
		this.taxCalcClientSecret  = tccsec;
	}

	public String taxAdminURL =  "This value is the Admin Vertex O Series URL";	// should have a function to read from DB or persistence file
	//public String taxAdminURL = getTaxAdminURL();
	public String getTaxAdminURL()
	{
		return this.taxAdminURL ;
	}
	public void setTaxAdminURL(String taxadminurl) {
		this.taxAdminURL = taxadminurl;
	}

	public String taxAdminClientId =  "This value is the Admin Vertex O Series Client Id";	// should have a function to read from DB or persistence file
	//public String taxAdminClientId = getTaxAdminClientId();
	public String getTaxAdminClientId()
	{
		return this.taxAdminClientId ;
	}
	public void setTaxAdminClientId(String tacid) {
		this.taxAdminClientId = tacid;
	}

	public String taxAdminClientSecret =  "This value is the Admin Vertex O Series Client Secret";	// should have a function to read from DB or persistence file
	//public String taxAdminClientSecret = getTaxAdminClientSecret();
	public String getTaxAdminClientSecret()
	{
		return this.taxAdminClientSecret ;
	}
	public void setTaxAdminClientSecret(String tacsec) {
		this.taxAdminClientSecret = tacsec;
	}

	public String taxamoValidationURL =  "This value is the Taxamo Validation URL";	// should have a function to read from DB or persistence file
	//public String taxamoValidationURL = getTaxamoValidationURL();
	public String getTaxamoValidationURL()
	{
		return this.taxamoValidationURL ;
	}
	public void setTaxamoValidationURL(String txurl) {
		this.taxamoValidationURL = txurl;
	}

	public String taxamoAuthToken =  "This value is the Taxamo Auth Token";	// should have a function to read from DB or persistence file
	//public String taxamoAuthToken = getTaxamoAuthToken();
	public String getTaxamoAuthToken()
	{
		return this.taxamoAuthToken ;
	}
	public void setTaxamoAuthToken(String txat) {
		this.taxamoAuthToken = txat;
	}
}
