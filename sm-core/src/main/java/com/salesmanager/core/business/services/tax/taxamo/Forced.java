package com.salesmanager.core.business.services.tax.taxamo;

public class Forced {
    private String evidence_value;
    private boolean used;
    private String resolved_country_code;
    private String evidence_type;


    // Getter Methods

    public String getEvidence_value() {
        return evidence_value;
    }

    public boolean getUsed() {
        return used;
    }

    public String getResolved_country_code() {
        return resolved_country_code;
    }

    public String getEvidence_type() {
        return evidence_type;
    }

    // Setter Methods

    public void setEvidence_value(String evidence_value) {
        this.evidence_value = evidence_value;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }

    public void setResolved_country_code(String resolved_country_code) {
        this.resolved_country_code = resolved_country_code;
    }

    public void setEvidence_type(String evidence_type) {
        this.evidence_type = evidence_type;
    }
}
