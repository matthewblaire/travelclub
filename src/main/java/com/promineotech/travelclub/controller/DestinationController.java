package com.promineotech.travelclub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.promineotech.travelclub.entity.Destination;
import com.promineotech.travelclub.service.DestinationService;

@RestController
@RequestMapping("/destinations")
public class DestinationController {
	
	@Autowired
	private DestinationService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<Object> getDestination(@PathVariable Long id) {
		try {
			return new ResponseEntity<Object>(service.getDestinationById(id), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Object>(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<Object> getDestinations() {
		return new ResponseEntity<Object>(service.getDestinations(), HttpStatus.OK);
	}
	
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Object> createDestination(@RequestBody Destination destination) {
		return new ResponseEntity<Object>(service.createDestination(destination), HttpStatus.CREATED);
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.PUT)
	public ResponseEntity<Object> updateDestination(@RequestBody Destination destination, @PathVariable Long id) {
		try {
			return new ResponseEntity<Object>(service.updateDestination(destination, id), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Object>(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
	public ResponseEntity<Object> deleteDestination(@PathVariable Long id) {
		try {
			service.deleteDestination(id);
			return new ResponseEntity<Object>("Successfully deleted customer with id: " + id, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Object>(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}
	
	
}
