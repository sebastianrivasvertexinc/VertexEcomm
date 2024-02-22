package com.salesmanager.core.business.services.tax.taxamo;


import java.util.ArrayList;

public class TransactionRequest {
    private String force_country_code;

    private String invoice_number; //for sending custom invoice ID from Shopizer
    private String buyer_name;
    private String buyer_email;
    private String status;
    private String currency_code;
    Invoice_address invoice_address;
    public ArrayList < Transaction_line > transaction_lines = new ArrayList < Transaction_line > ();
    private String buyer_tax_number;
    private String buyer_ip;
    private String billing_country_code;
    private String buyer_credit_card_prefix;


    // Getter Methods

    public String getForce_country_code() {
        return force_country_code;
    }

    public String getInvoice_number() { return invoice_number;}

    public String getBuyer_name() {
        return buyer_name;
    }

    public String getBuyer_email() {
        return buyer_email;
    }

    public String getStatus() {
        return status;
    }

    public String getCurrency_code() {
        return currency_code;
    }

    public Invoice_address getInvoice_address() {
        return invoice_address;
    }

    public String getBuyer_tax_number() {
        return buyer_tax_number;
    }

    public String getBuyer_ip() {
        return buyer_ip;
    }

    public String getBilling_country_code() {
        return billing_country_code;
    }

    public String getBuyer_credit_card_prefix() {
        return buyer_credit_card_prefix;
    }

    // Setter Methods

    public void setForce_country_code(String force_country_code) {
        this.force_country_code = force_country_code;
    }

    public void setInvoice_number(String invoice_number) {this.invoice_number = invoice_number;}
    public void setBuyer_name(String buyer_name) {
        this.buyer_name = buyer_name;
    }

    public void setBuyer_email(String buyer_email) {
        this.buyer_email = buyer_email;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setCurrency_code(String currency_code) {
        this.currency_code = currency_code;
    }

    public void setInvoice_address(Invoice_address invoice_addressObject) {
        this.invoice_address = invoice_addressObject;
    }

    public void setBuyer_tax_number(String buyer_tax_number) {
        this.buyer_tax_number = buyer_tax_number;
    }

    public void setBuyer_ip(String buyer_ip) {
        this.buyer_ip = buyer_ip;
    }

    public void setBilling_country_code(String billing_country_code) {
        this.billing_country_code = billing_country_code;
    }

    public void setBuyer_credit_card_prefix(String buyer_credit_card_prefix) {
        this.buyer_credit_card_prefix = buyer_credit_card_prefix;
    }


}
