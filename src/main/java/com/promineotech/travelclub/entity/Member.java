package com.promineotech.travelclub.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Member {

	private Long id;
	private String firstName;
	private String middleName;
	private String lastName;
	private Set<LoyaltyClub> loyaltyclubs;

	private int miles;
	private String phoneNumber;
	private String email;
	private Set<Itinerary> itineraries;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getMiles() {
		return miles;
	}

	public void setMiles(int miles) {
		this.miles = miles;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@OneToMany(mappedBy = "members")

	public Set<Itinerary> getItineraries() {
		return itineraries;
	}

	public void setItineraries(Set<Itinerary> itineraries) {
		this.itineraries = itineraries;
	}

	@ManyToMany(mappedBy = "members")
	public Set<LoyaltyClub> getLoyaltyclubs() {
		return loyaltyclubs;
	}

	public void setLoyaltyclubs(Set<LoyaltyClub> loyaltyclubs) {
		this.loyaltyclubs = loyaltyclubs;
	}

}
