package com.example.mongodbtutorial.shared.models;

import org.springframework.data.annotation.Id;

public abstract class BaseDocument {
    @Id
    private String id;
}
