package com.promineotech.travelclub.controller;

import com.promineotech.travelclub.entity.Itinerary;
import com.promineotech.travelclub.service.ItineraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/itineraries")
public class ItineraryController {

    @Autowired
    private ItineraryService itineraryService;

    @PostMapping("/register")
    public ResponseEntity<Object> register(@RequestBody Itinerary itinerary) {
        Itinerary newItinerary = itineraryService.createItinerary(itinerary);

        ResponseEntity<Object> responseEntity = new ResponseEntity<Object>(newItinerary, HttpStatus.CREATED);
        return responseEntity;
    }
}
