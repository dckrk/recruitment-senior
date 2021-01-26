package com.sabre.dckrk.recruitment.supplier;

import com.sabre.dckrk.recruitment.model.CabinClass;
import com.sabre.dckrk.recruitment.model.Flight;
import com.sabre.dckrk.recruitment.model.Price;

public interface PricesSupplier {

    // Unfortunately we are able to retrieve only single price for particular cabin
    // This is how it was designed by some ...
    Price retrievePricesForFlight(Flight flight, CabinClass cabinClass);

}
