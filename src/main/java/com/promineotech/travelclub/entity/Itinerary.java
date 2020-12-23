package com.promineotech.travelclub.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/*
Itinerary (Many to One) Member
Itinerary (Many to One) Destinations
Itinerary (Many to One) Flight Numbers
 */

@Entity
public class Itinerary {

	private int id;
	private Member members;
	private FlightNumber flightNumbers;
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
	public Member getMembers() {
		return members;
	}

	public void setMembers(Member members) {
		this.members = members;
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

	public FlightNumber getFlightNumbers() {
		return flightNumbers;
	}

	@ManyToOne
	@JoinColumn(name = "flightNumberId")
	public void setFlightNumbers(FlightNumber flightNumbers) {
		this.flightNumbers = flightNumbers;
	}

}
