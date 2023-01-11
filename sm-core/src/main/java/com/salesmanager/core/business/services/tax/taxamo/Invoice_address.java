package com.salesmanager.core.business.services.tax.taxamo;

public class Invoice_address {
    private String freeform_address;

    private String country;
    private String city;
    private String postal_code;
    private String region;


    public String getCity() {
        return city;
    }

    public String getPostal_code() {
        return postal_code;
    }

    public String getRegion() {
        return region;
    }

    // Setter Methods



    public void setCity(String city) {
        this.city = city;
    }

    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }

    public void setRegion(String region) {
        this.region = region;
    }
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
