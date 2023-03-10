package com.example.mongodbtutorial.Season.service;

import com.example.mongodbtutorial.Season.model.Season;
import com.example.mongodbtutorial.Season.repository.SeasonRepository;

import java.util.List;

public interface SeasonService {

    public Season findById(String id);

    public List<Season> findAll();

    public Season findByYear(Long year);

    public Season save(Season season);

    public Season update(Season season);

    public String delete(Season season);
}
