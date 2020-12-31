package com.promineotech.travelclub.service;

import com.promineotech.travelclub.entity.Itinerary;
import com.promineotech.travelclub.repository.ItineraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItineraryService {

    @Autowired
    private ItineraryRepository itineraryRepository;

    public Itinerary createItinerary(Itinerary itinerary) {
        return itineraryRepository.save(itinerary);
    }

    public Iterable<Itinerary> getAllItineraries() {
        return itineraryRepository.findAll();
    }

    public Itinerary getItinerary(Long id) {
        return itineraryRepository.findById(id).get();
    }

    public Itinerary updateItinerary(Itinerary itinerary, Long id) throws Exception {
        Itinerary foundItinerary = itineraryRepository.findById(id).get();
        if (foundItinerary == null) {
            throw new Exception("Itinerary not found.");
        }
        foundItinerary.setarrivalTime(itinerary.getarrivalTime());
        foundItinerary.setdepartureTime(itinerary.getdepartureTime());
        foundItinerary.setArrivalDestinationId(itinerary.getArrivalDestinationId());
        return itineraryRepository.save(foundItinerary);
    }

    public void deleteItinerary(Long id) {
        itineraryRepository.deleteById(id);
    }

    public void deleteAllItineraries() {
        itineraryRepository.deleteAll();
    }
}
