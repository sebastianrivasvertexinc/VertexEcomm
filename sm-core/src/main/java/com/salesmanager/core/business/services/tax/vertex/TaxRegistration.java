package com.salesmanager.core.business.services.tax.vertex;
import java.math.BigDecimal;
import java.util.ArrayList;


public class TaxRegistration {
    private boolean hasPhysicalPresenceIndicator;
    private String isoCountryCode;
    private String taxRegistrationNumber;


    // Getter Methods

    public boolean getHasPhysicalPresenceIndicator() {
        return hasPhysicalPresenceIndicator;
    }

    public String getIsoCountryCode() {
        return isoCountryCode;
    }

    public String getTaxRegistrationNumber() {
        return taxRegistrationNumber;
    }

    // Setter Methods

    public void setHasPhysicalPresenceIndicator(boolean hasPhysicalPresenceIndicator) {
        this.hasPhysicalPresenceIndicator = hasPhysicalPresenceIndicator;
    }

    public void setIsoCountryCode(String isoCountryCode) {
        this.isoCountryCode = isoCountryCode;
    }

    public void setTaxRegistrationNumber(String taxRegistrationNumber) {
        this.taxRegistrationNumber = taxRegistrationNumber;
    }
}
