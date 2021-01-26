package com.sabre.dckrk.recruitment.supplier;

import com.sabre.dckrk.recruitment.model.Flight;

import java.time.LocalDate;
import java.util.List;

public interface FlightSupplier {

    List<Flight> retrieveAvailableFlights(String origin, String destination, LocalDate day);

}
