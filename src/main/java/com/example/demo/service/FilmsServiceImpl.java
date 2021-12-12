package com.example.demo.service;

import com.example.demo.entity.Films;
import com.example.demo.repo.FilmsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmsServiceImpl implements FilmsService {

    @Autowired
    FilmsRepo filmsRepo;


    @Override
    public List<Films> findAllFilms() {
        return filmsRepo.findAllFilms();
    }

    @Override
    public List<Films> findFilmsByRating(Integer child) {
        return filmsRepo.findFilmsByRating(child);
    }
}
