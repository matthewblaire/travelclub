package com.promineotech.travelclub.controller;

import com.promineotech.travelclub.entity.Itinerary;
import com.promineotech.travelclub.service.ItineraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/itinerary")
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

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Object> getItinerary(@PathVariable Long id) {
        return new ResponseEntity<>(itineraryService.getItinerary(id), HttpStatus.OK);
    }

    @RequestMapping(value ="/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Object> deleteItinerary(@PathVariable Long id) {
        itineraryService.deleteItinerary(id);
        return new ResponseEntity<>("Deleted Itinerary by Id: " + id, HttpStatus.OK);
    }

}
