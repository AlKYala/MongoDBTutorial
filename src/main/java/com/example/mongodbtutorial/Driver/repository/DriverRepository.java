package com.example.mongodbtutorial.Driver.repository;

import com.example.mongodbtutorial.Driver.model.Driver;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DriverRepository extends MongoRepository<Driver, String> {
}
