package com.rzs.peliculasapp.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class MovieInfo(
    val adult : Boolean,
    val backdropPath : String,
    //val genreIds : List<Int>,
    val movieId : Int,
    val originalLang : String,
    val originalTitle : String,
    val overview : String,
    val popularity : Float,
    val posterPath : String,
    val releaseDate : String,
    val title : String,
    val video : Boolean,
    val voteAverage : Float,
    val voteCount : Int,
    @PrimaryKey val id: Int? = null
)