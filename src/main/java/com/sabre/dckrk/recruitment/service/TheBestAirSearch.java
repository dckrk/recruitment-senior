package com.sabre.dckrk.recruitment.service;

import com.sabre.dckrk.recruitment.api.AirSearchResponse;
import com.sabre.dckrk.recruitment.model.CabinClass;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class TheBestAirSearch implements AirSearchService {

    //todo Please implement below method
    @Override
    public AirSearchResponse search(String origin, String destination, LocalDate day, CabinClass cabinClass) {
        return null;

    }


}
