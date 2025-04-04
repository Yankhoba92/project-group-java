package com.sakila.rest.controllers;

import com.sakila.rest.entities.Film;
import com.sakila.rest.services.FilmServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/films")
public class FilmController {

    private final FilmServiceImpl filmService;

    @Autowired
    public FilmController(FilmServiceImpl filmService) {
        this.filmService = filmService;
    }

    @PostMapping
    public Film createFilm(@RequestBody Film film) {
        return filmService.create(film);
    }

    @GetMapping("/{id}")
    public Film getFilm(@PathVariable Integer id) {
        return filmService.read(id);
    }

    @DeleteMapping("/{id}")
    public boolean deleteFilm(@PathVariable Integer id) {
        return filmService.delete(id);
    }

    @GetMapping("/search")
    public List<Film> searchFilms(@RequestParam String title) {
        return filmService.findByTitleContaining(title);
    }

    @GetMapping
    public List<Film> getAllFilms() {
        return filmService.readAll();
    }
}
