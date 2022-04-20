package com.rzs.peliculasapp.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class MovieInfo(
    @PrimaryKey val id: Int? = null
)