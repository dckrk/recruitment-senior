package com.sabre.dckrk.recruitment.model;

import java.math.BigDecimal;

//todo *Please add support for discounts
public class Discount {

    private BigDecimal amount;

    public Discount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getAmount() {
        return amount;
    }
}
