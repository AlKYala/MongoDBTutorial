package com.example.mongodbtutorial.Car.model.Result.repository;

import com.example.mongodbtutorial.Car.model.Result.model.Result;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ResultRepository extends MongoRepository<Result, String> {
}
