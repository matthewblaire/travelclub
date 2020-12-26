package com.promineotech.travelclub.controller;

import com.promineotech.travelclub.entity.FlightNumber;
import com.promineotech.travelclub.service.FlightNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
