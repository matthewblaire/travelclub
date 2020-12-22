package com.promineotech.travelclub.repository;

import org.springframework.data.repository.CrudRepository;

import com.promineotech.travelclub.entity.Airline;

public interface AirlineRepository extends CrudRepository<Airline, Long> {

}
