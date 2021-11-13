package com.example.folksdev.movies.repository;

import com.example.folksdev.movies.model.Director;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DirectorRepository extends JpaRepository<Director,String> {
}
