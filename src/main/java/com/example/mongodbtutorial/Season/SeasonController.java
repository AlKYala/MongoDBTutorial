package com.example.mongodbtutorial.Season;

import com.example.mongodbtutorial.Season.model.Season;
import com.example.mongodbtutorial.Season.repository.SeasonRepository;
import com.example.mongodbtutorial.Season.service.SeasonService;
import com.example.mongodbtutorial.Season.service.SeasonServiceReactive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/season")
public class SeasonController {

    @Autowired
    private SeasonServiceReactive seasonService;

    @GetMapping("/{year}")
    public Mono<Season> getSeasonByYear(@PathVariable Long year) {
        return this.seasonService.findByYear(year);
    }
    @GetMapping(path = "/all", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Season> findAll() {
        return this.seasonService.findAll();
    }

    @GetMapping("/foo")
    public void doTheFoo() {
        seasonService.foo();
    }
}
