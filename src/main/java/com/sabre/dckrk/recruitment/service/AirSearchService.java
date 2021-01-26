package com.sabre.dckrk.recruitment.service;

import com.sabre.dckrk.recruitment.api.AirSearchResponse;
import com.sabre.dckrk.recruitment.model.CabinClass;

import java.time.LocalDate;

public interface AirSearchService {

    AirSearchResponse search(String origin, String destination, LocalDate day, CabinClass cabinClass);

}
