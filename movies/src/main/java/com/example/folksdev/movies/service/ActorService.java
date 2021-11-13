package com.example.folksdev.movies.service;

import com.example.folksdev.movies.model.Actor;
import com.example.folksdev.movies.repository.ActorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActorService {
    private final ActorRepository actorRepository;

    public ActorService(ActorRepository actorRepository) {
        this.actorRepository = actorRepository;
    }

    protected List<Actor> getActorList(List<String> idList){
        return actorRepository.findAllByIdIn(idList);
    }



}
