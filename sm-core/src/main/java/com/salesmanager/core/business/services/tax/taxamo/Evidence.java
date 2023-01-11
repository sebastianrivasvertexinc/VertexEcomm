package com.salesmanager.core.business.services.tax.taxamo;

public class Evidence {
    By_ip By_ipObject;
    By_cc By_ccObject;
    By_tax_number By_tax_numberObject;
    By_billing By_billingObject;
    Forced ForcedObject;


    // Getter Methods

    public By_ip getBy_ip() {
        return By_ipObject;
    }

    public By_cc getBy_cc() {
        return By_ccObject;
    }

    public By_tax_number getBy_tax_number() {
        return By_tax_numberObject;
    }

    public By_billing getBy_billing() {
        return By_billingObject;
    }

    public Forced getForced() {
        return ForcedObject;
    }

    // Setter Methods

    public void setBy_ip(By_ip by_ipObject) {
        this.By_ipObject = by_ipObject;
    }

    public void setBy_cc(By_cc by_ccObject) {
        this.By_ccObject = by_ccObject;
    }

    public void setBy_tax_number(By_tax_number by_tax_numberObject) {
        this.By_tax_numberObject = by_tax_numberObject;
    }

    public void setBy_billing(By_billing by_billingObject) {
        this.By_billingObject = by_billingObject;
    }

    public void setForced(Forced forcedObject) {
        this.ForcedObject = forcedObject;
    }
}
