package com.csd.musicgenerationsystem.controller;

import com.csd.musicgenerationsystem.model.TrackerDataModel;
import com.csd.musicgenerationsystem.service.TrackerDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tracker-data")
@CrossOrigin(value = "*")
public class TrackerDataController {
    private final TrackerDataService trackerDataService;

    @Autowired
    public TrackerDataController(TrackerDataService trackerDataService) {
        this.trackerDataService = trackerDataService;
    }

    @GetMapping()
    public TrackerDataModel getSimulatedTrackerData() {
        return this.trackerDataService.generateDataFromTheDevice();
    }
}
