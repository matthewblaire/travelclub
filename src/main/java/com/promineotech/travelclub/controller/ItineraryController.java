package com.promineotech.travelclub.controller;

import com.promineotech.travelclub.entity.Itinerary;
import com.promineotech.travelclub.service.ItineraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/itineraries")
public class ItineraryController {

    @Autowired
    private ItineraryService itineraryService;

    @PostMapping("/register")
    public ResponseEntity<Object> register(@RequestBody Itinerary itinerary) {
        Itinerary newItinerary = itineraryService.createItinerary(itinerary);

        ResponseEntity<Object> responseEntity = new ResponseEntity<>(newItinerary, HttpStatus.CREATED);
        return responseEntity;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Object> getAllItineraries() {
        return new ResponseEntity<>(itineraryService.getAllItineraries(), HttpStatus.OK);
    }

}
