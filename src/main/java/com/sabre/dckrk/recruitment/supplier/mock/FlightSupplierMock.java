package com.sabre.dckrk.recruitment.supplier.mock;

import com.sabre.dckrk.recruitment.model.Flight;
import com.sabre.dckrk.recruitment.supplier.FlightSupplier;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

public class FlightSupplierMock implements FlightSupplier {

    @Override
    public List<Flight> retrieveAvailableFlights(String origin, String destination, LocalDate day) {

        Flight earlyFlight = new Flight("KRK", "WAW",
                LocalDateTime.of(day, LocalTime.of(5, 45)));
        Flight morningFlight = new Flight("KRK", "WAW",
                LocalDateTime.of(day, LocalTime.of(9, 30)));
        Flight midDayFlight = new Flight("KRK", "WAW",
                LocalDateTime.of(day, LocalTime.of(12, 0)));
        Flight eveningFlight = new Flight("KRK", "WAW",
                LocalDateTime.of(day, LocalTime.of(17, 15)));
        Flight lateFlight = new Flight("KRK", "WAW",
                LocalDateTime.of(day, LocalTime.of(19, 23)));
        Flight veryLateFlight = new Flight("KRK", "WAW",
                LocalDateTime.of(day, LocalTime.of(23, 30)));

        return Arrays.asList(earlyFlight, morningFlight, eveningFlight, veryLateFlight, midDayFlight, lateFlight);
    }
}
