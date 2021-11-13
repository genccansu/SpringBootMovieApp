package com.example.folksdev.movies.dto

import com.example.folksdev.movies.model.Gender
import com.fasterxml.jackson.annotation.JsonInclude
import java.time.LocalDate

data class ActorDto @JvmOverloads constructor(
        val id: String,
        val name: String,
        val dateOfBirth: LocalDate,
        val gender: Gender,
        @JsonInclude(JsonInclude.Include.NON_EMPTY)
        val movieList: List<MovieDto>? = ArrayList()
)
