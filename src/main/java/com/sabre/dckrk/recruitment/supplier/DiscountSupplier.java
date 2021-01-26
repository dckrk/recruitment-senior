package com.sabre.dckrk.recruitment.supplier;

import com.sabre.dckrk.recruitment.model.Discount;
import com.sabre.dckrk.recruitment.model.Flight;

public interface DiscountSupplier {

    Discount iWannaDiscount(Flight flight);

    Discount iWannaDiscount(Flight flight, Boolean isPremiumUser);

}
