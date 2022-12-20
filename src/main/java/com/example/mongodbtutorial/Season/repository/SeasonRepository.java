package com.example.mongodbtutorial.Season.repository;

import com.example.mongodbtutorial.Season.model.Season;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

import java.util.Optional;

public interface SeasonRepository extends ReactiveMongoRepository<Season, String> {

    @Query("{year:  ?0}")
    public Mono<Season> findSeasonByYear(Long year);
}
