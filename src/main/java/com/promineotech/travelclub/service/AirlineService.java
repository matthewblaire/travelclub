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
	
//	public Airline searchAirline(Airline airline) throws Exception {
//		String pAirline = airline.getName();
//		
//		Airline foundAirline = airlineRepository.findByAirline(airline);
//		
//		if(foundAirline == null) {
//			throw new Exception("Airline: " + pAirline + " does not exist.");
//		}
//		if(!foundAirline.getName().equals(pAirline)) {
//			throw new Exception("Invalid airline.");
//		}
//		
//		return foundAirline;
//	}


}
