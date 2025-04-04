package com.sakila.intro.controllers;


import com.sakila.intro.entities.Country;
import com.sakila.intro.services.CountryService;
import jakarta.transaction.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
    @RequestMapping("/country")
public class CountryController {

    private final CountryService service;

    public CountryController(CountryService service) {
        this.service = service;
    }

    @GetMapping("/all")
    public List<Country> getAllCountries() {
        return service.readAll();
    }

    @GetMapping("/get/{id}")
    public Country getCountryById(@PathVariable("id") int id) {
        return service.read(id);
    }
}
