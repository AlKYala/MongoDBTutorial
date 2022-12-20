package com.example.mongodbtutorial.Season.repository;

import com.example.mongodbtutorial.Season.model.Season;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface SeasonRepository extends MongoRepository<Season, String> {

    @Query("{year:  ?0}")
    public Optional<Season> findSeasonByYear(Long year);
}
