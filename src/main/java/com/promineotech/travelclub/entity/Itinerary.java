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

	private Long id;
	private Member members;
	private FlightNumber flightNumber;
	private Destination destination;
	private int arrivalDestinationId;
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
	public Destination getDestination() {
		return destination;
	}

	public void setDestination(Destination destinations) {
		this.destination = destinations;
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

	@ManyToOne
	@JoinColumn(name = "flightNumberId")
	public FlightNumber getFlightNumber() {
		return flightNumber;
	}

	
	public void setFlightNumber(FlightNumber flightNumbers) {
		this.flightNumber = flightNumbers;
	}

}
