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
    private Set<Airline> airlineName;
    private int airlineCode;
    private Set<FlightNumber> flightNumbers;
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
    public Set<Airline> getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(Set<Airline> airlineName) {
        this.airlineName = airlineName;
    }

    public int getAirlineCode() {
        return airlineCode;
    }

    public void setAirlineCode(int airlineCode) {
        this.airlineCode = airlineCode;
    }

    @OneToMany
    @JoinColumn(name = "flightNumberId")
    public Set<FlightNumber> getFlightNumbers() {
        return flightNumbers;
    }

    public void setFlightNumbers(Set<FlightNumber> flightNumbers) {
        this.flightNumbers = flightNumbers;
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
