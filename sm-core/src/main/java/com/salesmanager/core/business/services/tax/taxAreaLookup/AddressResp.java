package com.salesmanager.core.business.services.tax.taxAreaLookup;
import com.salesmanager.core.business.services.tax.vertex.Jurisdiction;

import java.util.ArrayList;
public class AddressResp {

    private String asOfDate;
    private String confidenceIndicator;
    ArrayList <Jurisdiction> jurisdictions = new ArrayList<Jurisdiction>();
   ArrayList <PostalAddress> postalAddresses = new ArrayList<PostalAddress>();
   private String taxAreaId;


    // Getter Methods

    public String getAsOfDate() {
        return asOfDate;
    }

    public String getConfidenceIndicator() {
        return confidenceIndicator;
    }

    public String getTaxAreaId() {
        return taxAreaId;
    }

    // Setter Methods

    public void setAsOfDate(String asOfDate) {
        this.asOfDate = asOfDate;
    }

    public void setConfidenceIndicator(String confidenceIndicator) {
        this.confidenceIndicator = confidenceIndicator;
    }

    public void setTaxAreaId(String taxAreaId) {
        this.taxAreaId = taxAreaId;
    }

    public ArrayList<PostalAddress>  getPostalAddresses() {
        return postalAddresses;
    }

    public void setPostalAddresses(ArrayList<PostalAddress> postalAddresses) {
        this.postalAddresses = postalAddresses;
    }
}
