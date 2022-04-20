package com.rzs.peliculasapp.data.repository

import com.rzs.peliculasapp.data.data_source.MovieInfoDao
import com.rzs.peliculasapp.domain.repository.MovieRepository

class MoviesRepositoryImpl(
    private val dao: MovieInfoDao
) : MovieRepository {
}