package com.salesmanager.core.business.services.tax.taxAreaLookup;


public class AddressCleansingReq {
        private String asOfDate;
        PostalAddress postalAddress;
        private boolean returnTimeElapsedDetailsIndicator;


        // Getter Methods

        public String getAsOfDate() {
            return asOfDate;
        }

        public PostalAddress getPostalAddress() {
            return postalAddress;
        }

        public boolean getReturnTimeElapsedDetailsIndicator() {
            return returnTimeElapsedDetailsIndicator;
        }

        // Setter Methods

        public void setAsOfDate(String asOfDate) {
            this.asOfDate = asOfDate;
        }

        public void setPostalAddress(PostalAddress postalAddressObject) {
            this.postalAddress = postalAddressObject;
        }

        public void setReturnTimeElapsedDetailsIndicator(boolean returnTimeElapsedDetailsIndicator) {
            this.returnTimeElapsedDetailsIndicator = returnTimeElapsedDetailsIndicator;
        }
    }

