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
    private Airline airlineName;
    private int airlineCode;
    private Set<Itinerary> itinerary;
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

    @OneToOne
    @JoinColumn(name = "airlineName")
    public Airline getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(Airline airlineName) {
        this.airlineName = airlineName;
    }

    public int getAirlineCode() {
        return airlineCode;
    }

    public void setAirlineCode(int airlineCode) {
        this.airlineCode = airlineCode;
    }

    
    @JoinColumn(name = "itineraryId")
    public Set<Itinerary> getItineraries() {
        return itinerary;
    }

    public void setItineraries(Set<Itinerary> itineraries) {
        this.itinerary = itineraries;
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
