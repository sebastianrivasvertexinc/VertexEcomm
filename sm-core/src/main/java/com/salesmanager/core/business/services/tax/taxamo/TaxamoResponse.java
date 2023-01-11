package com.salesmanager.core.business.services.tax.taxamo;

import java.util.ArrayList;

public class TaxamoResponse {

        TransactionResponse transaction;
        ArrayList< Object > tax_required_fields = new ArrayList < Object > ();
        ArrayList < Object > storage_required_fields = new ArrayList < Object > ();
        private boolean is_delegated;


        // Getter Methods

        public TransactionResponse getTransaction() {
            return transaction;
        }

        public boolean getIs_delegated() {
            return is_delegated;
        }

        // Setter Methods

        public void setTransaction(TransactionResponse transactionObject) {
            this.transaction = transactionObject;
        }

        public void setIs_delegated(boolean is_delegated) {
            this.is_delegated = is_delegated;
        }
    }


