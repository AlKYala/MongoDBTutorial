package com.example.mongodbtutorial.Team.model;

import com.example.mongodbtutorial.Result.model.Result;
import com.example.mongodbtutorial.shared.models.BaseDocument;
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
public class Team extends BaseDocument {

    private String name;

    @DocumentReference
    private List<Result> resultList;
}
