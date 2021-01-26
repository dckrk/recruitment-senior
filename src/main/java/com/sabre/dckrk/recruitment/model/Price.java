package com.sabre.dckrk.recruitment.model;

public class Price {

    private final Double amount;
    private final String currency;

    public Price(Double amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public Double getAmount() {
        return this.amount;
    }

    public String getCurrency() {
        return this.currency;
    }
}
