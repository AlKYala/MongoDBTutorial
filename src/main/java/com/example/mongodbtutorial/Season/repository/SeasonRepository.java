package com.example.mongodbtutorial.Season.repository;

import com.example.mongodbtutorial.Season.model.Season;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SeasonRepository extends MongoRepository<Season, String> {
}
