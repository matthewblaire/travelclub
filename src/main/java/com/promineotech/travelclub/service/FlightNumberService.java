package com.promineotech.travelclub.service;

import com.promineotech.travelclub.entity.FlightNumber;
import com.promineotech.travelclub.repository.AirlineRepository;
import com.promineotech.travelclub.repository.FlightNumberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightNumberService {

    @Autowired
    private FlightNumberRepository flightNumberRepository;
    //private AirlineRepository airlineRepository;

    public FlightNumber createFlightNumber(FlightNumber flightNumber) {
        return flightNumberRepository.save(flightNumber);
    }

    public Iterable<FlightNumber> getAllFlightNumbers() {
        return flightNumberRepository.findAll();
    }

    public FlightNumber getFlightNumber(Long id) {
        return flightNumberRepository.findById(id).get();
    }

    public FlightNumber updateFlight(FlightNumber flightNumber, Long id) {
        FlightNumber foundFlightNumber = flightNumberRepository.findById(id).get();

        foundFlightNumber.setDepartureTime(flightNumber.getDepartureTime());
        foundFlightNumber.setArrivalTime(flightNumber.getArrivalTime());

        return flightNumberRepository.save(foundFlightNumber);
    }

    public void deleteFlightNumber(Long id) {
        flightNumberRepository.deleteById(id);
    }

    public void deleteAllFlightNumbers() {
        flightNumberRepository.deleteAll();
    }
}
