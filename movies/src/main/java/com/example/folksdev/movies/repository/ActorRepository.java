package com.example.folksdev.movies.repository;

import com.example.folksdev.movies.model.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ActorRepository extends JpaRepository<Actor,String> {
   List<Actor> findAllByIdIn(List<String> idList);
}
