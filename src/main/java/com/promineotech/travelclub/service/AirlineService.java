package com.promineotech.travelclub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.promineotech.travelclub.entity.Airline;
import com.promineotech.travelclub.repository.AirlineRepository;

@Service
public class AirlineService {
	
	@Autowired
	private AirlineRepository airlineRepository;
	
	public Airline createAirline(Airline airline) {
		return airlineRepository.save(airline);
	}

}
