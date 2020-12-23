package com.promineotech.travelclub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.promineotech.travelclub.entity.Airline;

@Service
public class AirlineService {
	
	//@Autowired
	//private AirlineRepository airlineRepository = new AirlineRepository();
	
	public Airline createAirline(Airline airline) {
		return null;
		//return airlineRepository.save(airline);
	}

}
