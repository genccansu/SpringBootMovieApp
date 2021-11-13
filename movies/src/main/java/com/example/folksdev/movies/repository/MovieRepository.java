package com.example.folksdev.movies.repository;

import com.example.folksdev.movies.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface MovieRepository extends JpaRepository<Movie,String> {

    //SELECT * FROM Movie WHERE title={mahmut}
    Movie findByTitle(String mahmut);

    //SELECT * FROM Movie WHERE title = {title} AND description LIKE '%description%'
    Movie findByTitleAndDescriptionIsLike(String title, String description);

    //SELECT * FROM Movie WHERE duration < {duration}
    Movie findByDurationLessThan(Integer duration);

    @Query(value = "select m.imdbUrl from Movie m where m.id=?1")
    Optional<String> selectImdbUrlByMovieId(String id);
}
