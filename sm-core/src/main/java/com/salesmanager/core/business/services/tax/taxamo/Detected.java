package com.salesmanager.core.business.services.tax.taxamo;

import java.util.ArrayList;

public class Detected {
    private String code_long;
    private String name;
    private String cca2;
    private String tax_region;
    private String codenum;
    ArrayList<Object> currency = new ArrayList<Object>();
    private String code;
    private String cca3;
    ArrayList<Object> callingCode = new ArrayList<Object>();
    private String tax_number_country_code;
    private boolean tax_supported;
    private String ccn3;


    // Getter Methods

    public String getCode_long() {
        return code_long;
    }

    public String getName() {
        return name;
    }

    public String getCca2() {
        return cca2;
    }

    public String getTax_region() {
        return tax_region;
    }

    public String getCodenum() {
        return codenum;
    }

    public String getCode() {
        return code;
    }

    public String getCca3() {
        return cca3;
    }

    public String getTax_number_country_code() {
        return tax_number_country_code;
    }

    public boolean getTax_supported() {
        return tax_supported;
    }

    public String getCcn3() {
        return ccn3;
    }

    // Setter Methods

    public void setCode_long(String code_long) {
        this.code_long = code_long;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCca2(String cca2) {
        this.cca2 = cca2;
    }

    public void setTax_region(String tax_region) {
        this.tax_region = tax_region;
    }

    public void setCodenum(String codenum) {
        this.codenum = codenum;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setCca3(String cca3) {
        this.cca3 = cca3;
    }

    public void setTax_number_country_code(String tax_number_country_code) {
        this.tax_number_country_code = tax_number_country_code;
    }

    public void setTax_supported(boolean tax_supported) {
        this.tax_supported = tax_supported;
    }

    public void setCcn3(String ccn3) {
        this.ccn3 = ccn3;
    }
}
