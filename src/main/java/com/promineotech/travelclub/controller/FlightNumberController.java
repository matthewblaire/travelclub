package com.promineotech.travelclub.controller;

import com.promineotech.travelclub.entity.FlightNumber;
import com.promineotech.travelclub.service.FlightNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/flight_numbers")
public class FlightNumberController {

    @Autowired
    private FlightNumberService flightNumberService;

    @PostMapping("/create")
    public ResponseEntity<Object> register(@RequestBody FlightNumber flightNumber) {
        FlightNumber newFlightNumber = flightNumberService.createFlightNumber(flightNumber);

        ResponseEntity<Object> responseEntity = new ResponseEntity<Object>(newFlightNumber, HttpStatus.CREATED);
        return responseEntity;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Object> getAllFlightNumbers() {
        return new ResponseEntity<>(flightNumberService.getAllFlightNumbers(), HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Object> getFlightNumber(@PathVariable Long id) {
        return new ResponseEntity<>(flightNumberService.getFlightNumber(id), HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Object> updateFlightNumber(@RequestBody FlightNumber flightNumber, @PathVariable Long id) {
        try {
            return new ResponseEntity<Object>(flightNumberService.updateFlight(flightNumber, id), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Object>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Object> deleteFlightNumber(@PathVariable Long id) {
        flightNumberService.deleteFlightNumber(id);
        return new ResponseEntity<Object>("Deleted comment with id: " + id, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public ResponseEntity<Object> deleteAllFlightNumbers() {
        flightNumberService.deleteAllFlightNumbers();
        return new ResponseEntity<>("Deleted All Flight Numbers", HttpStatus.OK);
    }

}
