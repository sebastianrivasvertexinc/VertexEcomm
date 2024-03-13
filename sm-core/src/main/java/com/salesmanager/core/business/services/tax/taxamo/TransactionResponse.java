package com.salesmanager.core.business.services.tax.taxamo;


import java.util.ArrayList;

public class TransactionResponse {
    private float amount;
    Invoice_address invoice_address;

    public ArrayList < Transaction_line > transaction_lines = new ArrayList < Transaction_line > ();
    private String buyer_credit_card_prefix;
    ArrayList<Object> custom_fields = new ArrayList<Object>();
    private String tax_country_codes;
    private String key;
    private float tax_amount;
    private String buyer_tax_number;
    private boolean tax_deducted;
    private String tax_region;
    private String billing_country_code;
    private String confirm_timestamp;
    private float merchant_id;
    Evidence EvidenceObject;
    private String invoice_place;
    private String create_timestamp;
    private String tax_country_code;
    Countries CountriesObject;
    private String buyer_ip;
    private String buyer_email;
    private boolean manual;
    private String force_country_code;
    private String einvoicing_provider;
    private String country_name;
    private String product_classes;
    private boolean fully_informative;
    private String tax_engine;
    private String status;
    private String kind;
    private String invoice_image_url;
    private String tax_number_service;
    private String order_date_type;
    private float update_timestamp;

    private String buyer_name;
    private float deducted_tax_amount;
    private String order_date;
    private boolean invoice_capable;
    private float total_amount;
    private String tax_timezone;
    private boolean test;
    private float tax_entity_id;
    private String tax_entity_name;
    private boolean tax_supported;
    private float tax_location_id;
    private String currency_code;

    public AdditionalCurrencies additional_currencies;

    public AdditionalCurrencies getAdditional_currencies() {
        return additional_currencies;
    }

    public void setAdditional_currencies(AdditionalCurrencies additional_currencies) {
        this.additional_currencies = additional_currencies;
    }

    // Getter Methods

    public float getAmount() {
        return amount;
    }

    public com.salesmanager.core.business.services.tax.taxamo.Invoice_address getInvoice_address() {
        return invoice_address;
    }

    public String getBuyer_credit_card_prefix() {
        return buyer_credit_card_prefix;
    }

    public String getTax_country_codes() {
        return tax_country_codes;
    }

    public String getKey() {
        return key;
    }

    public float getTax_amount() {
        return tax_amount;
    }

    public String getBuyer_tax_number() {
        return buyer_tax_number;
    }

    public boolean getTax_deducted() {
        return tax_deducted;
    }

    public String getTax_region() {
        return tax_region;
    }

    public String getBilling_country_code() {
        return billing_country_code;
    }

    public String getConfirm_timestamp() {
        return confirm_timestamp;
    }

    public float getMerchant_id() {
        return merchant_id;
    }

    public Evidence getEvidence() {
        return EvidenceObject;
    }

    public String getInvoice_place() {
        return invoice_place;
    }

    public String getCreate_timestamp() {
        return create_timestamp;
    }

    public String getTax_country_code() {
        return tax_country_code;
    }

    public Countries getCountries() {
        return CountriesObject;
    }

    public String getBuyer_ip() {
        return buyer_ip;
    }

    public String getBuyer_email() {
        return buyer_email;
    }

    public boolean getManual() {
        return manual;
    }

    public String getForce_country_code() {
        return force_country_code;
    }

    public String getEinvoicing_provider() {
        return einvoicing_provider;
    }

    public String getCountry_name() {
        return country_name;
    }

    public String getProduct_classes() {
        return product_classes;
    }

    public boolean getFully_informative() {
        return fully_informative;
    }

    public String getTax_engine() {
        return tax_engine;
    }

    public String getStatus() {
        return status;
    }

    public String getKind() {
        return kind;
    }

    public String getInvoice_image_url() {
        return invoice_image_url;
    }

    public String getTax_number_service() {
        return tax_number_service;
    }

    public String getOrder_date_type() {
        return order_date_type;
    }

    public float getUpdate_timestamp() {
        return update_timestamp;
    }


    public String getBuyer_name() {
        return buyer_name;
    }

    public float getDeducted_tax_amount() {
        return deducted_tax_amount;
    }

    public String getOrder_date() {
        return order_date;
    }

    public boolean getInvoice_capable() {
        return invoice_capable;
    }

    public float getTotal_amount() {
        return total_amount;
    }

    public String getTax_timezone() {
        return tax_timezone;
    }

    public boolean getTest() {
        return test;
    }

    public float getTax_entity_id() {
        return tax_entity_id;
    }

    public String getTax_entity_name() {
        return tax_entity_name;
    }

    public boolean getTax_supported() {
        return tax_supported;
    }

    public float getTax_location_id() {
        return tax_location_id;
    }

    public String getCurrency_code() {
        return currency_code;
    }

    // Setter Methods

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public void setInvoice_address(Invoice_address invoice_addressObject) {
        this.invoice_address = invoice_address;
    }

    public void setBuyer_credit_card_prefix(String buyer_credit_card_prefix) {
        this.buyer_credit_card_prefix = buyer_credit_card_prefix;
    }

    public void setTax_country_codes(String tax_country_codes) {
        this.tax_country_codes = tax_country_codes;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setTax_amount(float tax_amount) {
        this.tax_amount = tax_amount;
    }

    public void setBuyer_tax_number(String buyer_tax_number) {
        this.buyer_tax_number = buyer_tax_number;
    }

    public void setTax_deducted(boolean tax_deducted) {
        this.tax_deducted = tax_deducted;
    }

    public void setTax_region(String tax_region) {
        this.tax_region = tax_region;
    }

    public void setBilling_country_code(String billing_country_code) {
        this.billing_country_code = billing_country_code;
    }

    public void setConfirm_timestamp(String confirm_timestamp) {
        this.confirm_timestamp = confirm_timestamp;
    }

    public void setMerchant_id(float merchant_id) {
        this.merchant_id = merchant_id;
    }

    public void setEvidence(Evidence evidenceObject) {
        this.EvidenceObject = evidenceObject;
    }

    public void setInvoice_place(String invoice_place) {
        this.invoice_place = invoice_place;
    }

    public void setCreate_timestamp(String create_timestamp) {
        this.create_timestamp = create_timestamp;
    }

    public void setTax_country_code(String tax_country_code) {
        this.tax_country_code = tax_country_code;
    }

    public void setCountries(Countries countriesObject) {
        this.CountriesObject = countriesObject;
    }

    public void setBuyer_ip(String buyer_ip) {
        this.buyer_ip = buyer_ip;
    }

    public void setBuyer_email(String buyer_email) {
        this.buyer_email = buyer_email;
    }

    public void setManual(boolean manual) {
        this.manual = manual;
    }

    public void setForce_country_code(String force_country_code) {
        this.force_country_code = force_country_code;
    }

    public void setEinvoicing_provider(String einvoicing_provider) {
        this.einvoicing_provider = einvoicing_provider;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    public void setProduct_classes(String product_classes) {
        this.product_classes = product_classes;
    }

    public void setFully_informative(boolean fully_informative) {
        this.fully_informative = fully_informative;
    }

    public void setTax_engine(String tax_engine) {
        this.tax_engine = tax_engine;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public void setInvoice_image_url(String invoice_image_url) {
        this.invoice_image_url = invoice_image_url;
    }

    public void setTax_number_service(String tax_number_service) {
        this.tax_number_service = tax_number_service;
    }

    public void setOrder_date_type(String order_date_type) {
        this.order_date_type = order_date_type;
    }

    public void setUpdate_timestamp(float update_timestamp) {
        this.update_timestamp = update_timestamp;
    }


    public void setBuyer_name(String buyer_name) {
        this.buyer_name = buyer_name;
    }

    public void setDeducted_tax_amount(float deducted_tax_amount) {
        this.deducted_tax_amount = deducted_tax_amount;
    }

    public void setOrder_date(String order_date) {
        this.order_date = order_date;
    }

    public void setInvoice_capable(boolean invoice_capable) {
        this.invoice_capable = invoice_capable;
    }

    public void setTotal_amount(float total_amount) {
        this.total_amount = total_amount;
    }

    public void setTax_timezone(String tax_timezone) {
        this.tax_timezone = tax_timezone;
    }

    public void setTest(boolean test) {
        this.test = test;
    }

    public void setTax_entity_id(float tax_entity_id) {
        this.tax_entity_id = tax_entity_id;
    }

    public void setTax_entity_name(String tax_entity_name) {
        this.tax_entity_name = tax_entity_name;
    }

    public void setTax_supported(boolean tax_supported) {
        this.tax_supported = tax_supported;
    }

    public void setTax_location_id(float tax_location_id) {
        this.tax_location_id = tax_location_id;
    }

    public void setCurrency_code(String currency_code) {
        this.currency_code = currency_code;
    }
}
