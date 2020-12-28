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

    @PostMapping("/register")
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

}
