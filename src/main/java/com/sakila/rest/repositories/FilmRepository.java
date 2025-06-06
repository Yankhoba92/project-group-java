package com.sakila.rest.repositories;

import com.sakila.rest.entities.Film;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FilmRepository extends JpaRepository<Film, Integer> {
    List<Film> findByTitleContaining(String title);
}
