package com.example.bikes.repositories;

import com.example.bikes.models.Bike;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface BikeRepository extends JpaRepository<Bike, Long> {

}
