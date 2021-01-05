package com.promineotech.travelclub.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
	@JsonIgnore
	private FlightNumber flightNumber;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
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

	@OneToOne(mappedBy = "airline")
	public FlightNumber getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(FlightNumber flightNumber) {
		this.flightNumber = flightNumber;
	}
}
