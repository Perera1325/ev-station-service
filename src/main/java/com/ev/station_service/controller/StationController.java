package com.ev.station_service.controller;

import com.ev.station_service.entity.Station;
import com.ev.station_service.service.StationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stations")
public class StationController {

    private final StationService service;

    public StationController(StationService service) {
        this.service = service;
    }

    // Create new station
    @PostMapping
    public Station createStation(@RequestBody Station station) {
        return service.saveStation(station);
    }

    // Get all stations
    @GetMapping
    public List<Station> getStations() {
        return service.getAllStations();
    }

    // Get station by ID (VERY IMPORTANT for Booking Service)
    @GetMapping("/{id}")
    public Station getStationById(@PathVariable Long id) {
        return service.getStationById(id);
    }
}
