package com.sabre.dckrk.recruitment.supplier.mock;

import com.sabre.dckrk.recruitment.model.Discount;
import com.sabre.dckrk.recruitment.model.Flight;
import com.sabre.dckrk.recruitment.supplier.DiscountSupplier;

import java.math.BigDecimal;

public class DiscountSupplierMock implements DiscountSupplier {
    @Override
    public Discount iWannaDiscount(Flight flight) {
        return new Discount(new BigDecimal(50));
    }

    @Override
    public Discount iWannaDiscount(Flight flight, Boolean isPremiumUser) {
        return new Discount(new BigDecimal(75));
    }
}
