package com.promineotech.travelclub.entity;


import javax.persistence.*;
import java.util.Set;

/*
FlightNumber (One to One) Airline
FlightNumber (One to Many) Itinerary
 */

@Entity
public class FlightNumber {

    private int id;
    private Airline airline;
    private Set<Itinerary> itineraries;
    private int departureTime;
    private int arrivalTime;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @OneToOne(mappedBy="flightNumber")
    @JoinColumn(name = "airlineId")
    public Airline getAirlineName() {
        return airline;
    }

    public void setAirlineName(Airline airline) {
        this.airline = airline;
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
}
