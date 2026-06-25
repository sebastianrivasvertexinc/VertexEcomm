package com.salesmanager.core.business.services.tax;

import java.time.Instant;

public class TokenInfo {

    private String token;
    private Instant expirationTime;

    // Constructor
    public TokenInfo(String token, Instant expirationTime) {
        this.token = token;
        this.expirationTime = expirationTime;
    }

    // Getter for token
    public String getToken() {
        return token;
    }

    // Setter for token
    public void setToken(String token) {
        this.token = token;
    }

    // Getter for expirationTime
    public Instant getExpirationTime() {
        return expirationTime;
    }

    // Setter for expirationTime
    public void setExpirationTime(Instant expirationTime) {
        this.expirationTime = expirationTime;
    }

    // Check if the token is expired
    public boolean isExpired() {
        return expirationTime == null || Instant.now().isAfter(expirationTime);
    }

    @Override
    public String toString() {
        return "TokenInfo{" +
                "token='" + token + '\'' +
                ", expirationTime=" + expirationTime +
                '}';
    }
}
