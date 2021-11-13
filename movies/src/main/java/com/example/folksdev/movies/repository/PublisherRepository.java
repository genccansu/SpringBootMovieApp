package com.example.folksdev.movies.repository;

import com.example.folksdev.movies.model.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher,String> {
}
