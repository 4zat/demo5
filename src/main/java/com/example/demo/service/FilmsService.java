package com.example.demo.service;

import com.example.demo.entity.Films;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FilmsService {
    List<Films> findAllFilms();

    List<Films> findFilmsByRating(Integer child);
}
