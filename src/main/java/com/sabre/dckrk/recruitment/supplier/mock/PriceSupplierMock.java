package com.sabre.dckrk.recruitment.supplier.mock;

import com.sabre.dckrk.recruitment.model.CabinClass;
import com.sabre.dckrk.recruitment.model.Flight;
import com.sabre.dckrk.recruitment.model.Price;
import com.sabre.dckrk.recruitment.supplier.PricesSupplier;
import org.springframework.stereotype.Component;

@Component
public class PriceSupplierMock implements PricesSupplier {

    private static final String defaultCurrency = "PLN";

    @Override
    public Price retrievePricesForFlight(Flight flight, CabinClass cabinClass) {

        double amount = Math.random() * 100 + 100;

        switch (cabinClass) {
            case BUSINESS:
                amount = amount * 3;
                break;
            case FIRST:
                amount = amount * 10;
                break;
            case RESIDENCE:
                amount = amount * 100;
                break;
            default:
                break;
        }

        return new Price(amount, defaultCurrency);
    }
}
