package com.example.folksdev.movies.dto

import com.example.folksdev.movies.model.GenresType
import com.fasterxml.jackson.annotation.JsonInclude

data class MovieDto @JvmOverloads constructor(
        val id:String,
        val title: String,
        val description: String,
        val imdbUrl: String? = "",
        val duration: String,
        val featuredYear: Int,
        val genresTypes: List<GenresType>,
        val actors: List<ActorDto>? = ArrayList(),
        @JsonInclude(JsonInclude.Include.NON_NULL)
        val director: DirectorDto? = null,
        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        val publisherName: String? = ""

)