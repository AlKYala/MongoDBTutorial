package com.example.mongodbtutorial.Team.repository;

import com.example.mongodbtutorial.Team.model.Team;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

import java.util.Optional;

public interface TeamRepository extends ReactiveMongoRepository<Team, String> {

    public Mono<Team> findTeamByName(String name);
}
