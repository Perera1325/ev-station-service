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

    @PostMapping
    public Station createStation(@RequestBody Station station) {
        return service.saveStation(station);
    }

    @GetMapping
    public List<Station> getStations() {
        return service.getAllStations();
    }
}
