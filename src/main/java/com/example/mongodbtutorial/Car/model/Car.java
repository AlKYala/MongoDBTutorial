package com.example.mongodbtutorial.Car.model;

import com.example.mongodbtutorial.Driver.model.Driver;
import com.example.mongodbtutorial.shared.models.BaseDocument;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Data
@Document
@Getter
@Setter
@AllArgsConstructor
public class Car extends BaseDocument {

    private Integer horsepower;

    private String model;
}
