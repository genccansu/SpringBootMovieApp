package com.example.folksdev.movies.service;

import com.example.folksdev.movies.model.Director;
import com.example.folksdev.movies.repository.DirectorRepository;
import org.springframework.stereotype.Service;

@Service
public class DirectorService {
    private final DirectorRepository directorRepository;

    public DirectorService(DirectorRepository directorRepository) {
        this.directorRepository = directorRepository;
    }

    protected Director findDirectorById(String id){
        return directorRepository.findById(id).orElseThrow(() -> new RuntimeException("asd"));
    }

    protected Director getDirectorById(String id){
        return directorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("asd"));
    }
}
