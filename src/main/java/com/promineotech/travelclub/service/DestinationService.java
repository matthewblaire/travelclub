package com.promineotech.travelclub.service;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.promineotech.travelclub.entity.Destination;
import com.promineotech.travelclub.repository.DestinationRepository;

@Service
public class DestinationService {
	
	private static final Logger logger = LogManager.getLogger(DestinationService.class);
	
	@Autowired
	private DestinationRepository repo;
	
	public Iterable<Destination> getDestinations() {
		return repo.findAll();
	}
	
	public Destination getDestinationById(Long id) {
		try {
			return repo.findById(id).orElse(null);
		} catch (Exception e) {
			logger.error("Exception occurred while trying to retrieve destination: " + id, e);
			throw e;
		}
	}
	
	public Destination createDestination(Destination destination) {
		return repo.save(destination);
	}
	
	public Destination updateDestination(Destination destination, Long id) throws Exception {
		
		try {
			Destination oldDestination = repo.findById(id).orElse(null);
			oldDestination.setCity(destination.getCity());
			oldDestination.setCode(destination.getCode());
			oldDestination.setCountry(destination.getCountry());
			oldDestination.setState(destination.getState());
			return repo.save(oldDestination);
		} catch (Exception e) {
			logger.error("Exception occurred while trying to update destination: " + id, e);
			throw new Exception("Unable to update destination.");
		}
		
	}
	
	public void deleteDestination(Long id) throws Exception {
		try {
			repo.deleteById(id);
		} catch (Exception e) {
			logger.error("Exception occurred while trying to delete destination: " + id, e);
			throw new Exception("Unable to delete destination.");
		}
	}
	
}
