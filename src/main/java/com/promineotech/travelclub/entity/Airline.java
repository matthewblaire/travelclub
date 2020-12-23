package com.promineotech.travelclub.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Airline {
	
	private Long id;
	private String name;
	private String codename;
	private String headquarters;
	private FlightNumber flightNumber;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	@OneToOne(mappedBy = "airlineName")
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

	public FlightNumber getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumbers(FlightNumber flightNumber) {
		this.flightNumber = flightNumber;
	}
}
