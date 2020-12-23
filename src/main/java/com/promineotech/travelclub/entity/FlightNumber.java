package com.promineotech.travelclub.entity;


import javax.persistence.*;
import java.util.Set;

/*
FlightNumber (One to One) Airline
FlightNumber (One to Many) Itinerary
 */

@Entity
public class FlightNumber {

    private Long id;
    private Long airlineId;
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

    
    @OneToOne(mappedBy="flightNumber")
	public Long getAirlineId() {
		return airlineId;
	}

	public void setAirlineId(Long airlineId) {
		this.airlineId = airlineId;
	}
}
