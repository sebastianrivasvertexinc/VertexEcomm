package com.salesmanager.core.business.services.tax.taxamo;

public class TaxamoRequest {
    TransactionRequest transaction;
    private String private_token;


    // Getter Methods

    public TransactionRequest getTransaction() {
        return transaction;
    }

    public String getPrivate_token() {
        return private_token;
    }

    // Setter Methods

    public void setTransaction(TransactionRequest transactionObject) {
        this.transaction = transactionObject;
    }

    public void setPrivate_token(String private_token) {
        this.private_token = private_token;
    }
}




