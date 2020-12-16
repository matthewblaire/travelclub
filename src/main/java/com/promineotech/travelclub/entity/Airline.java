package com.promineotech.travelclub.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Airline {
	
	private long id;
	private String name;
	private String codename;
	private String headquarters;
	private Set<Member> members;
	private Set<FlightNumber> flightNumbers;
	private Set<Itinerary> itineraries;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
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
	
	@ManyToOne
	@JoinColumn(name = "memberId")
	public Set<Member> getMembers() {
		return members;
	}
	public void setMembers(Set<Member> members) {
		this.members = members;
	}
	
	//1-1?
	public Set<FlightNumber> getFlightNumbers() {
		return flightNumbers;
	}
	public void setFlightNumbers(Set<FlightNumber> flightNumbers) {
		this.flightNumbers = flightNumbers;
	}
	
	@ManyToMany(mappedBy = "airlines")
	public Set<Itinerary> getItineraries() {
		return itineraries;
	}
	public void setItineraries(Set<Itinerary> itineraries) {
		this.itineraries = itineraries;
	}
	
	
	
	

}
