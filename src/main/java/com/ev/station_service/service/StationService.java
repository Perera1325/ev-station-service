package com.ev.station_service.service;

import com.ev.station_service.entity.Station;
import com.ev.station_service.repository.StationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StationService {

    private final StationRepository repository;

    public StationService(StationRepository repository) {
        this.repository = repository;
    }

    // Save station
    public Station saveStation(Station station) {
        return repository.save(station);
    }

    // Get all stations
    public List<Station> getAllStations() {
        return repository.findAll();
    }

    // Get station by ID (VERY IMPORTANT for Booking Service)
    public Station getStationById(Long id) {
        return repository.findById(id).orElse(null);
    }
}
