package com.rzs.peliculasapp.domain.repository

import com.rzs.peliculasapp.domain.model.TmdbResponse

interface MovieRepository {

    suspend fun getPlayingNow(page : Int) : TmdbResponse

    suspend fun getTopRated(page : Int) : TmdbResponse
}