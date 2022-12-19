package com.example.mongodbtutorial.shared;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/dummy")
@RequiredArgsConstructor
public class DummyController {

    @Autowired
    private Environment environment;

    @GetMapping("/config")
    private ResponseEntity<Map<String, String>> debugStuff() {
        Map<String, String> environmentDebug = new HashMap<String, String>();

        environmentDebug.put("dbUsername", environment.getProperty("spring.data.mongodb.username"));
        environmentDebug.put("dbPassword", environment.getProperty("spring.data.mongodb.password"));
        environmentDebug.put("databaseName", environment.getProperty("spring.data.mongodb.database"));

        return ResponseEntity.ok().body(environmentDebug);
    }
}
