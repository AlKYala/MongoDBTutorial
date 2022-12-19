package com.example.mongodbtutorial.Driver.model;

import com.example.mongodbtutorial.Car.model.Car;
import com.example.mongodbtutorial.Result.model.Result;
import com.example.mongodbtutorial.shared.models.BaseDocument;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Data
@Document
@Getter
@Setter
public class Driver extends BaseDocument {

    private String firstName;

    private String lastName;

    @DocumentReference
    private List<Car> cars;

    @DocumentReference
    private Result result;
}
