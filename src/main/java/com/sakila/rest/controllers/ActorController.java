package com.sakila.rest.controllers;

import com.sakila.rest.entities.Actor;
import com.sakila.rest.services.ActorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/actors")
public class ActorController {
    private final ActorService actorService;
    public ActorController(ActorService actorService) {
        this.actorService = actorService;
    }



    @GetMapping
    public List<Actor> getAllActors() {
        return actorService.getAllActors();
    }

    @GetMapping("/search")
    public List<Actor> searchActors(@RequestParam String name) {
        return actorService.searchActorsByName(name);
    }

}
