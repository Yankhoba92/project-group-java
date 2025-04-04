package com.sakila.rest.services;

import com.sakila.rest.entities.Actor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ActorService  {
    List<Actor> getAllActors();
    List<Actor> searchActorsByName(String namePart);
}
