package com.sakila.rest.services;

import com.sakila.rest.entities.Film;
import java.util.List;

public interface FilmService extends IService<Film, Integer> {
    // Méthode de recherche par titre
    List<Film> findByTitleContaining(String title);
}
