package com.sakila.rest.repositories;

import com.sakila.rest.entities.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ActorRepository extends JpaRepository<Actor, Integer> {
    @Query("SELECT a FROM Actor a WHERE LOWER(a.firstName) LIKE LOWER(CONCAT('%', :namePart, '%')) OR LOWER(a.lastName) LIKE LOWER(CONCAT('%', :namePart, '%'))")
    List<Actor> findByNameContaining(@Param("namePart") String namePart);
}
