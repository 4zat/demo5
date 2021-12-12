package com.example.demo.repo;

import com.example.demo.entity.Films;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FilmsRepo extends JpaRepository<Films, Integer> {

    @Query("select f from Films f")
    List<Films> findAllFilms();

    @Query("select f from Films f where f.rating <= :child")
    List<Films> findFilmsByRating(@Param("child") Integer child);
}
