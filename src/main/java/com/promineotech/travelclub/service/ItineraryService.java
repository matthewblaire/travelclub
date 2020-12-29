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


    public void deleteItinerary(Long id) {
        itineraryRepository.deleteById(id);
    }
}
