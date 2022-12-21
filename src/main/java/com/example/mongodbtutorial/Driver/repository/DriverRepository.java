package com.example.mongodbtutorial.Driver.repository;

import com.example.mongodbtutorial.Driver.model.Driver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface DriverRepository extends ReactiveMongoRepository<Driver, String> {
}
