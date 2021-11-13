package com.example.folksdev.movies.model

import org.hibernate.annotations.GenericGenerator
import javax.persistence.*

@Entity
@Table
data class Publisher @JvmOverloads constructor(
        @Id
        @Column(name = "publisher_id")
        @GeneratedValue(generator = "UUID")
        @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
        val id: String? = "",
        val name: String,

        ) {

}
