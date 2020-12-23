package com.promineotech.travelclub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.promineotech.travelclub.entity.Airline;
import com.promineotech.travelclub.service.AirlineService;

@RestController
@RequestMapping("/airlines")
public class AirlineController {
	
	@Autowired
	private AirlineService airlineService;
	
	@PostMapping("/addAirline")
	public ResponseEntity<Airline> add(@RequestBody Airline airline) {
		return null;
	}

}
