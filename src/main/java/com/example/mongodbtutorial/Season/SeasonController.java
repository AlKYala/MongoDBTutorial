package com.example.mongodbtutorial.Season;

import com.example.mongodbtutorial.Season.model.Season;
import com.example.mongodbtutorial.Season.repository.SeasonRepository;
import com.example.mongodbtutorial.Season.service.SeasonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/season")
public class SeasonController {

    @Autowired
    private SeasonService seasonService;

    @GetMapping("/{year}")
    public Season getSeasonByYear(@PathVariable Long year) {
        return this.seasonService.findByYear(year);
    }
    @GetMapping()
    public List<Season> getAll() {
        return this.seasonService.findAll();
    }
    @GetMapping("/paginated")
    public List<Season> findPaginated(@RequestParam Integer page, @RequestParam Integer size) {
        if(page == null || size == null)
            throw new RuntimeException("Check URL params");

        return this.seasonService.paginate(page, size);
    }
}
