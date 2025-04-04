package com.sakila.intro.controllers;

import com.sakila.intro.entities.City;
import com.sakila.intro.services.CityService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
    @RequestMapping("/city")
public class CityController {
    private final CityService cityService;


    public CityController(CityService cityService) {
        this.cityService = cityService;
    }


    @GetMapping({"","/all"})
    public List<City> getAll(){
        return cityService.readAll();
    }

    /**
     * Methode qui renvoie les villes en fonction d'une partie d'un nom
     * localhost:9093/sakila/city/search/Pa
     * @param name
     * @return
     */
    @GetMapping("/search/{name}")
    public List<City> searchBy(@PathVariable("name") String name ){
        return cityService.searchByName(name) ;
    }

    /**
     * Idem
     *
     * mais l'url sera :
     * localhost:9093/sakila/city/nameLike?str=Pa
     * @param name
     * @return
     */
    @GetMapping("/nameLike")
    public List<City> getByName(@RequestParam("str") String name ){
        return cityService.searchByName(name) ;
    }

    @GetMapping("/capital")
    public List<City> getAllCapitals(){
        return cityService.getAllCapitals() ;
    }
}
