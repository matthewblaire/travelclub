package com.promineotech.travelclub.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

/*
FlightNumber (One to One) Airline
FlightNumber (One to Many) Itinerary
 */

@Entity
public class FlightNumber {

    private Long id;
    private Airline airline;
    private Set<Itinerary> itineraries;
    private int departureTime;
    private int arrivalTime;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @OneToMany(mappedBy= "flightNumber")
    public Set<Itinerary> getItineraries() {
        return itineraries;
    }

    public void setItineraries(Set<Itinerary> itinerary) {
        this.itineraries = itinerary;
    }

    public int getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(int departureTime) {
        this.departureTime = departureTime;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(int arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    @OneToOne
    @JoinColumn(name="airlineId")
	public Airline getAirline() {
		return airline;
	}

	public void setAirline(Airline airline) {
		this.airline = airline;
	}
}
