package com.promineotech.travelclub.entity;

import javax.persistence.*;
import java.util.Set;

/*
Itinerary (Many to One) Member
Itinerary (Many to One) Destinations
Itinerary (Many to One) Flight Numbers
 */

@Entity
public class Itinerary {

    private int id;
    private Set<Member> members;
    private Set<FlightNumber> flightNumbers;
    private Set<Destination> destinations;
    private int arrivalDestinationId;
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

    @ManyToOne
    @JoinColumn(name = "memberId")
    public Set<Member> getMembers() {
        return members;
    }

    public void setMembers(Set<Member> members) {
        this.members = members;
    }

    @ManyToOne
    @JoinColumn(name = "flightNumberId")
    public Set<FlightNumber> getFlightNumbers() {
        return flightNumbers;
    }

    public void setFlightNumbers(Set<FlightNumber> flightNumbers) {
        this.flightNumbers = flightNumbers;
    }

    @ManyToOne
    @JoinColumn(name = "destinationId")
    public Set<Destination> getDestinations() {
        return destinations;
    }

    public void setDestinations(Set<Destination> destinations) {
        this.destinations = destinations;
    }

    public int getArrivalDestinationId() {
        return arrivalDestinationId;
    }

    public void setArrivalDestinationId(int arrivalDestinationId) {
        this.arrivalDestinationId = arrivalDestinationId;
    }

    public int getdepartureTime() {
        return departureTime;
    }

    public void setdepartureTime(int departureTime) {
        this.departureTime = departureTime;
    }

    public int getarrivalTime() {
        return arrivalTime;
    }

    public void setarrivalTime(int arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

}
