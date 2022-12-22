package com.salesmanager.core.business.services.tax.vertex;
import java.math.BigDecimal;
import java.util.ArrayList;
public class LineItem{
    public ArrayList<AssistedParameter> assistedParameters;
    public Customer customer;
    public String deliveryTerm;
    public BigDecimal extendedPrice;
    public double fairMarketValue;
    public FlexibleFields flexibleFields;
    public int lineItemNumber;
    public Product product;
    public Quantity quantity;
    public ArrayList<RateOverride> rateOverrides;
    public Seller seller;
    public boolean taxIncludedIndicator;

    public ArrayList<Taxis> getTaxes() {
        return taxes;
    }

    public void setTaxes(ArrayList<Taxis> taxes) {
        this.taxes = taxes;
    }

    public ArrayList<Taxis> taxes;
  //  public double totalTax;
    public String transactionType;
    public BigDecimal unitPrice;
}
