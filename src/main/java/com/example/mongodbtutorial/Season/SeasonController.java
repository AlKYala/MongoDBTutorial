package com.example.mongodbtutorial.Season;

import com.example.mongodbtutorial.Season.model.Season;
import com.example.mongodbtutorial.Season.repository.SeasonRepository;
import com.example.mongodbtutorial.Season.service.SeasonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/season")
public class SeasonController {

    @Autowired
    private SeasonService seasonService;

    @GetMapping("/{year}")
    public Season getSeasonByYear(@PathVariable Long year) {
        return this.seasonService.findByYear(year);
    }
}
