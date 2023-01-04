package com.salesmanager.core.business.services.tax.taxamo;

public class Invoice_address {
    private String freeform_address;
    private String country;


    // Getter Methods

    public String getFreeform_address() {
        return freeform_address;
    }

    public String getCountry() {
        return country;
    }

    // Setter Methods

    public void setFreeform_address(String freeform_address) {
        this.freeform_address = freeform_address;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
