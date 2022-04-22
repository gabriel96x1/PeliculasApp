package com.rzs.peliculasapp.data.repository

import com.rzs.peliculasapp.data.data_source.MovieInfoDao
import com.rzs.peliculasapp.domain.model.TmdbResponse
import com.rzs.peliculasapp.domain.repository.MovieRepository

class MoviesRepositoryImpl(
    private val dao: MovieInfoDao
) : MovieRepository {
    override suspend fun getPlayingNow(page: Int): TmdbResponse {
        return dao.getPlayingNow(page)
    }

    override suspend fun getTopRated(page: Int): TmdbResponse {
        return dao.getTopRated(page)
    }
}