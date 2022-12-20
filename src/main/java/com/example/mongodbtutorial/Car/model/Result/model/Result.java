package com.example.mongodbtutorial.Car.model.Result.model;

import com.example.mongodbtutorial.Driver.model.Driver;
import com.example.mongodbtutorial.Season.model.Season;
import com.example.mongodbtutorial.Team.model.Team;
import com.example.mongodbtutorial.shared.models.BaseDocument;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

@Document
@Data
@Getter
@Setter
@AllArgsConstructor
public class Result extends BaseDocument {

    @DocumentReference(lazy=true)
    private Team team;

    @DocumentReference(lazy=true)
    private Driver driver;

    private String seasonId;
}
