package com.promineotech.travelclub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
	public ResponseEntity<Object> add(@RequestBody Airline airline) {
		Airline addAirline = airlineService.createAirline(airline);
		
		ResponseEntity<Object> responseEntity = new ResponseEntity<Object>(addAirline, HttpStatus.CREATED); 
		
		return responseEntity;
	}
	
//	@PostMapping("/searchAirline")
//	private ResponseEntity<Object> search(@RequestBody Airline airline) throws Exception{
//		ResponseEntity<Object> responseEntity;
//		Airline foundAirline = airlineService.searchAirline(airline);
//		responseEntity = new ResponseEntity<Object>(foundAirline, HttpStatus.OK);
//		
//		
//		return responseEntity;
//	}

}
