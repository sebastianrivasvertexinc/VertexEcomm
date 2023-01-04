package com.salesmanager.core.business.services.tax.taxamo;

import com.salesmanager.core.business.services.tax.taxamo.Invoice_address;

public class TaxamoVatValidate {

    Invoice_address Invoice_addressObject;
    private String buyer_tax_number;
    private boolean tax_deducted;
    private String billing_country_code;
    private boolean buyer_tax_number_format_valid;
    private String warnings = null;
    private boolean buyer_tax_number_valid;
    private String buyer_tax_number_normalized;
    private String buyer_name;


    // Getter Methods

    public Invoice_address getInvoice_address() {
        return Invoice_addressObject;
    }

    public String getBuyer_tax_number() {
        return buyer_tax_number;
    }

    public boolean getTax_deducted() {
        return tax_deducted;
    }

    public String getBilling_country_code() {
        return billing_country_code;
    }

    public boolean getBuyer_tax_number_format_valid() {
        return buyer_tax_number_format_valid;
    }

    public String getWarnings() {
        return warnings;
    }

    public boolean getBuyer_tax_number_valid() {
        return buyer_tax_number_valid;
    }

    public String getBuyer_tax_number_normalized() {
        return buyer_tax_number_normalized;
    }

    public String getBuyer_name() {
        return buyer_name;
    }

    // Setter Methods

    public void setInvoice_address(Invoice_address invoice_addressObject) {
        this.Invoice_addressObject = invoice_addressObject;
    }

    public void setBuyer_tax_number(String buyer_tax_number) {
        this.buyer_tax_number = buyer_tax_number;
    }

    public void setTax_deducted(boolean tax_deducted) {
        this.tax_deducted = tax_deducted;
    }

    public void setBilling_country_code(String billing_country_code) {
        this.billing_country_code = billing_country_code;
    }

    public void setBuyer_tax_number_format_valid(boolean buyer_tax_number_format_valid) {
        this.buyer_tax_number_format_valid = buyer_tax_number_format_valid;
    }

    public void setWarnings(String warnings) {
        this.warnings = warnings;
    }

    public void setBuyer_tax_number_valid(boolean buyer_tax_number_valid) {
        this.buyer_tax_number_valid = buyer_tax_number_valid;
    }

    public void setBuyer_tax_number_normalized(String buyer_tax_number_normalized) {
        this.buyer_tax_number_normalized = buyer_tax_number_normalized;
    }

    public void setBuyer_name(String buyer_name) {
        this.buyer_name = buyer_name;
    }
}
