package com.example.mongodbtutorial.Season.service;

import com.example.mongodbtutorial.Season.model.Season;
import com.example.mongodbtutorial.Season.repository.SeasonRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class SeasonServiceImpl implements SeasonService{

    @Autowired
    private SeasonRepository seasonRepository;

    @Override
    public Season findById(String id) {
        return seasonRepository.findById(id).get();
    }

    @Override
    @Cacheable("seasons")
    public List<Season> findAll() {
        return seasonRepository.findAll();
    }

    @Override
    public Season findByYear(Long year) {
        return seasonRepository.findSeasonByYear(year).get();
    }

    @Override
    public Season save(Season season) {
        return seasonRepository.save(season);
    }

    @Override
    public Season update(Season season) {
        //leaving out special update logic because this is just a demo
        return seasonRepository.save(season);
    }

    @Override
    public String delete(Season season) {
        seasonRepository.delete(season);
        return season.getId();
    }

    @Override
    public List<Season> paginate(int page, int pageSize) {
        PageRequest pageRequest = PageRequest.of(page, pageSize);

        return this.seasonRepository.findAll(pageRequest).stream().toList();
    }
}
