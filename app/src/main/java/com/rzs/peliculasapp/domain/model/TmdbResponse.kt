package com.rzs.peliculasapp.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class TmdbResponse(
    val dates : String,
    val page : Int,
    //val results : List<MovieInfo>,
    val totalPages : Int,
    val totalResults : Int,
    @PrimaryKey val id: Int? = null

)