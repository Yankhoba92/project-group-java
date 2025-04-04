package com.sakila.rest.services;

import com.sakila.rest.entities.Film;
import com.sakila.rest.repositories.FilmRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmServiceImpl {

    private final FilmRepository repository;

    public FilmServiceImpl(FilmRepository repository) {
        this.repository = repository;
    }

    public Film create(Film film) {
        return repository.save(film);
    }

    public Film read(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public boolean delete(Integer id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }

    public List<Film> readAll() {
        return repository.findAll();
    }

    public List<Film> findByTitleContaining(String title) {
        return repository.findByTitleContaining(title);
    }
}
