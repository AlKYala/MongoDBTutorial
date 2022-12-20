package com.example.mongodbtutorial.Car.repository;

import com.example.mongodbtutorial.Car.model.Car;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CarRepository extends MongoRepository<Car, String> {
}
