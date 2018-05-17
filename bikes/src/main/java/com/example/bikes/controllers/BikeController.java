package com.example.bikes.controllers;

import com.example.bikes.models.Bike;
import com.example.bikes.repositories.BikeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/api/v1")
public class BikeController {

    private BikeRepository bikeRepository;

    private Logger logger = LoggerFactory.getLogger(BikeController.class);

    public BikeController(BikeRepository bikeRepository) {
        this.bikeRepository = bikeRepository;
    }

    @GetMapping("/bikes")
    public Collection<Bike> getAll() {
        return bikeRepository.findAll();
    }

    @PostMapping("/bikes")
    public Bike add(@RequestBody Bike bike){
        logger.info("Adding: " + bike);
        return bikeRepository.save(bike);
    }

}
