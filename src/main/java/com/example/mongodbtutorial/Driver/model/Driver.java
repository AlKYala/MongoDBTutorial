package com.example.mongodbtutorial.Driver.model;

import com.example.mongodbtutorial.shared.models.BaseDocument;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
@Getter
@Setter
public class Driver extends BaseDocument {

    private String firstName;

    private String lastName;
}
