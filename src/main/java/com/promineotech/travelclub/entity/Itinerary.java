package com.promineotech.travelclub.entity;

public class Itinerary {

    private int id;
    private int memberId;
    private int airlineId;
    private int flightNumberId;
    private int departureDestinationId;
    private int arrivalDestinationId;
    private int departureTime;
    private int arrivalTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public int getAirlineId() {
        return airlineId;
    }

    public void setAirlineId(int airlineId) {
        this.airlineId = airlineId;
    }

    public int getFlightNumberId() {
        return flightNumberId;
    }

    public void setFlightNumberId(int flightNumberId) {
        this.flightNumberId = flightNumberId;
    }

    public int getDepartureDestinationId() {
        return departureDestinationId;
    }

    public void setDepartureDestinationId(int departureDestinationId) {
        this.departureDestinationId = departureDestinationId;
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
