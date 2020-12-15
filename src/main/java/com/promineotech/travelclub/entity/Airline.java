package com.promineotech.travelclub.entity;

import java.util.Set;

import javax.persistence.Entity;

@Entity
public class Airline {
	
	private long id;
	private String name;
	private String codename;
	private String headquarters;
	private Set<Member> members;
	private Set<FlightNumber> flightNumbers;
	private Set<Itinerary> itineraries;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCodename() {
		return codename;
	}
	public void setCodename(String codename) {
		this.codename = codename;
	}
	public String getHeadquarters() {
		return headquarters;
	}
	public void setHeadquarters(String headquarters) {
		this.headquarters = headquarters;
	}
	public Set<Member> getMembers() {
		return members;
	}
	public void setMembers(Set<Member> members) {
		this.members = members;
	}
	public Set<FlightNumber> getFlightNumbers() {
		return flightNumbers;
	}
	public void setFlightNumbers(Set<FlightNumber> flightNumbers) {
		this.flightNumbers = flightNumbers;
	}
	public Set<Itinerary> getItineraries() {
		return itineraries;
	}
	public void setItineraries(Set<Itinerary> itineraries) {
		this.itineraries = itineraries;
	}
	
	
	
	

}
