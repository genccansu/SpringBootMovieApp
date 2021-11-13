package com.example.folksdev.movies.dto.converter;

import com.example.folksdev.movies.dto.ActorDto;
import com.example.folksdev.movies.dto.DirectorDto;
import com.example.folksdev.movies.dto.MovieDto;
import com.example.folksdev.movies.model.Actor;
import com.example.folksdev.movies.model.Movie;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;


import static com.example.folksdev.movies.util.MovieDurationTimeUtil.getMovieDurationString;

@Component
public class MovieDtoConverter {

    public MovieDto convert(Movie from){
        return new MovieDto(
                from.getId(),
                from.getTitle(),
                from.getDescription(),
                from.getImdbUrl(),
                getMovieDurationString(from.getDuration()),
                from.getFeaturedYear(),
                from.getGenresTypes(),
                getActorList(from.getActors().stream().collect(Collectors.toList())),
                new DirectorDto(from.getDirector().getId(),
                        from.getDirector().getName(),
                        from.getDirector().getLastName()),
                         from.getPublisher().getName()

        );
    }

    private List<ActorDto> getActorList(List<Actor> actorList) {

        return actorList.stream()
                .map(a -> new ActorDto(
                        a.getId(),
                        a.getName(),
                        a.getDateOfBirth(),
                        a.getGender()))
                .collect(Collectors.toList());
    }
}
