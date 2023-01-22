package com.salesmanager.core.business.services.tax.taxAreaLookup;



public class PostalAddress {
    private String streetAddress1;
    private String city;
    private String mainDivision;
    private String postalCode;
    private String country;

    // Getter Methods

    public String getStreetAddress1() {
        return streetAddress1;
    }

    public String getCity() {
        return city;
    }

    public String getMainDivision() {
        return mainDivision;
    }

    public String getPostalCode() {
        return postalCode;
    }

    // Setter Methods

    public void setStreetAddress1(String streetAddress1) {
        this.streetAddress1 = streetAddress1;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setMainDivision(String mainDivision) {
        this.mainDivision = mainDivision;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }


    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }


}
