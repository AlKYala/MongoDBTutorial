package com.example.mongodbtutorial.Season.model;

import com.example.mongodbtutorial.Car.model.Result.model.Result;
import com.example.mongodbtutorial.shared.models.BaseDocument;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document
@Data
@Getter
@Setter
@CompoundIndex(name = "year_sorter", def = "{year : 1}")
@AllArgsConstructor
public class Season extends BaseDocument {

    @Indexed(unique = true)
    private Long year;

    @DocumentReference
    private List<Result> results;
}
