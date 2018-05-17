package com.example.bikes.controllers;

import com.example.bikes.models.Bike;
import com.example.bikes.repositories.BikeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class BikeController {

    private BikeRepository bikeRepository;

    private Logger logger = LoggerFactory.getLogger(BikeController.class);

    public BikeController(BikeRepository bikeRepository) {
        this.bikeRepository = bikeRepository;
    }

    @GetMapping("/bikes")
    @ResponseStatus(HttpStatus.FOUND)
    public Collection<Bike> getAll() {
        return bikeRepository.findAll();
    }


    @GetMapping("/bikes/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Bike get(@PathVariable Long id) {
        logger.info("Getting: " + id);
        Optional<Bike> b = bikeRepository.findById(id);
        if (! ((Optional) b).isPresent()) {
            logger.info("Bike with id " + id + " doesn't exist");
        }
        return b.get();
    }


    @DeleteMapping("/bikes/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable Long id) {
        logger.info("Getting: " + id);
        bikeRepository.deleteById(id);
    }


    @PostMapping("/bikes")
    @ResponseStatus(HttpStatus.OK)
    public Bike add(@RequestBody Bike bike){
        logger.info("Adding: " + bike);
        return bikeRepository.save(bike);
    }

    @PutMapping("/bikes/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Bike update(@PathVariable Long id, @RequestBody Bike bike) {
        logger.info("Updating: " + bike);
        Optional<Bike> b = bikeRepository.findById(id);
        if (! ((Optional) b).isPresent()) {
            logger.info("Bike with id " + id + " doesn't exist");
        }
        bike.setId(b.get().getId());
        Bike savedBike = bikeRepository.save(bike);
        return savedBike;
    }

}
