package com.example.mongodbtutorial.Season.repository;

import com.example.mongodbtutorial.Season.model.Season;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface SeasonRepository extends MongoRepository<Season, String> {

    @Query("{year:  ?0}")
    public Season findSeasonByYear(Long year);
}
