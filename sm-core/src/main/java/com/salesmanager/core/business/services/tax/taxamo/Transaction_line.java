package com.salesmanager.core.business.services.tax.taxamo;

import com.salesmanager.core.model.shoppingcart.ShoppingCartItem;

import java.math.BigDecimal;

public class Transaction_line {
    private String description;
    private BigDecimal amount;
    private String informative;
    private float tax_rate;
    private String custom_id;


    // Getter Methods

    public String getDescription() {
        return description;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public String getInformative() {
        return informative;
    }

    public float getTax_rate() {
        return tax_rate;
    }

    public String getCustom_id() {
        return custom_id;
    }

    // Setter Methods

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public void setInformative(String informative) {
        this.informative = informative;
    }

    public void setTax_rate(float tax_rate) {
        this.tax_rate = tax_rate;
    }

    public void setCustom_id(String custom_id) {
        this.custom_id = custom_id;
    }
}