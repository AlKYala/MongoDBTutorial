package com.example.mongodbtutorial.Team.repository;

import com.example.mongodbtutorial.Team.model.Team;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface TeamRepository extends MongoRepository<Team, String> {

    public Optional<Team> findTeamByName(String name);
}
