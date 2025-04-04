package com.sakila.rest.services;

import com.sakila.rest.entities.Actor;
import com.sakila.rest.repositories.ActorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActorServiceImpl implements ActorService {
    private final ActorRepository repository;

    public ActorServiceImpl(ActorRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Actor> getAllActors() {
        return repository.findAll();
    }

    @Override
    public List<Actor> searchActorsByName(String namePart) {
        return repository.findByNameContaining(namePart);
    }
}
