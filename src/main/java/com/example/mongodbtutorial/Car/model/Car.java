package com.example.mongodbtutorial.Car.model;

import com.example.mongodbtutorial.shared.models.BaseDocument;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
@Getter
@Setter
public class Car extends BaseDocument {

    private Integer horsepower;
}
