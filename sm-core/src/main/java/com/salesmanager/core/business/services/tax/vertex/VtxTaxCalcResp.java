package com.salesmanager.core.business.services.tax.vertex;

import java.util.ArrayList;

public class VtxTaxCalcResp {

    private String documentDate;
    ArrayList < LineItem > lineItems = new ArrayList < LineItem > ();
    private boolean returnAssistedParametersIndicator;
    private boolean roundAtLineLevel;
    private String saleMessageType;
    Seller SellerObject;
    private float subTotal;
    private float total;
    private float totalTax;
    private String transactionType;


    // Getter Methods

    public String getDocumentDate() {
        return documentDate;
    }

    public ArrayList<LineItem> getlineItems() {
        return lineItems;
    }

    public boolean getReturnAssistedParametersIndicator() {
        return returnAssistedParametersIndicator;
    }

    public boolean getRoundAtLineLevel() {
        return roundAtLineLevel;
    }

    public String getSaleMessageType() {
        return saleMessageType;
    }

    public Seller getSeller() {
        return SellerObject;
    }

    public float getSubTotal() {
        return subTotal;
    }

    public float getTotal() {
        return total;
    }

    public float getTotalTax() {
        return totalTax;
    }

    public String getTransactionType() {
        return transactionType;
    }

    // Setter Methods

    public void setDocumentDate(String documentDate) {
        this.documentDate = documentDate;
    }

    public void setReturnAssistedParametersIndicator(boolean returnAssistedParametersIndicator) {
        this.returnAssistedParametersIndicator = returnAssistedParametersIndicator;
    }

    public void setRoundAtLineLevel(boolean roundAtLineLevel) {
        this.roundAtLineLevel = roundAtLineLevel;
    }

    public void setSaleMessageType(String saleMessageType) {
        this.saleMessageType = saleMessageType;
    }

    public void setSeller(Seller sellerObject) {
        this.SellerObject = sellerObject;
    }

    public void setSubTotal(float subTotal) {
        this.subTotal = subTotal;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public void setTotalTax(float totalTax) {
        this.totalTax = totalTax;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }
}


