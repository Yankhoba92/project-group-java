package com.sakila.rest.services;

import com.sakila.rest.entities.Film;
import com.sakila.rest.repositories.FilmRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmServiceImpl implements FilmService {

    private final FilmRepository repository;

    public FilmServiceImpl(FilmRepository repository) {
        this.repository = repository;
    }

    @Override
    public Film create(Film film) {
        return repository.save(film);
    }

    @Override
    public Film read(Integer id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Film update(Film film) {
        if (repository.existsById(film.getId())) {
            return repository.save(film);
        }
        return null;
    }

    @Override
    public boolean delete(Integer id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public List<Film> readAll() {
        return repository.findAll();
    }

    // Implémentation de la méthode findByTitleContaining
    @Override
    public List<Film> findByTitleContaining(String title) {
        return repository.findByTitleContaining(title);
    }
}
