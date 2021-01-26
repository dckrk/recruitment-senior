package com.sabre.dckrk.recruitment.model;

import java.time.LocalDateTime;

public class Flight {

    private final String origin;
    private final String destination;
    private final LocalDateTime departure;

    public Flight(String origin, String destination, LocalDateTime departure) {
        this.origin = origin;
        this.destination = destination;
        this.departure = departure;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public LocalDateTime getDeparture() {
        return departure;
    }

}
