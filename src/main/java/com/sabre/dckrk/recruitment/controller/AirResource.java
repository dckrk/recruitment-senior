package com.sabre.dckrk.recruitment.controller;

import com.sabre.dckrk.recruitment.service.AirSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AirResource {

    private AirSearchService airSearchService;

    @Autowired
    public AirResource(AirSearchService airSearchService) {
        this.airSearchService = airSearchService;
    }

    //todo Please introduce response creator here
}
