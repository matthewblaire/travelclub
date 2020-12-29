package com.promineotech.travelclub.service;

import com.promineotech.travelclub.entity.FlightNumber;
import com.promineotech.travelclub.repository.FlightNumberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightNumberService {

    @Autowired
    private FlightNumberRepository flightNumberRepository;

    public FlightNumber createFlightNumber(FlightNumber flightNumber) {
        return flightNumberRepository.save(flightNumber);
    }

    public Iterable<FlightNumber> getAllFlightNumbers() {
        return flightNumberRepository.findAll();
    }

    public FlightNumber getFlightNumber(Long id) {
        return flightNumberRepository.findById(id).get();
    }


    public void deleteFlightNumber(Long id) {
        flightNumberRepository.deleteById(id);
    }
}
