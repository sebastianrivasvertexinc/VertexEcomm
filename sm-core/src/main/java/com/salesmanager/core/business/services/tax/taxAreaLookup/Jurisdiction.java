package com.salesmanager.core.business.services.tax.taxAreaLookup;

public class Jurisdiction {

        private String effectiveDate;
        private String expirationDate;
        private String jurisdictionId;
        private String jurisdictionType;
        private String value;


        // Getter Methods

        public String getEffectiveDate() {
            return effectiveDate;
        }

        public String getExpirationDate() {
            return expirationDate;
        }

        public String getJurisdictionId() {
            return jurisdictionId;
        }

        public String getJurisdictionType() {
            return jurisdictionType;
        }

        public String getValue() {
            return value;
        }

        // Setter Methods

        public void setEffectiveDate(String effectiveDate) {
            this.effectiveDate = effectiveDate;
        }

        public void setExpirationDate(String expirationDate) {
            this.expirationDate = expirationDate;
        }

        public void setJurisdictionId(String jurisdictionId) {
            this.jurisdictionId = jurisdictionId;
        }

        public void setJurisdictionType(String jurisdictionType) {
            this.jurisdictionType = jurisdictionType;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }