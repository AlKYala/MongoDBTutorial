package com.example.mongodbtutorial.Team.repository;

import com.example.mongodbtutorial.Team.model.Team;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TeamRepository extends MongoRepository<Team, String> {
}
