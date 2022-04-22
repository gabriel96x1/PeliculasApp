package com.rzs.peliculasapp.data.data_source

import androidx.room.Dao
import androidx.room.Query
import com.rzs.peliculasapp.domain.model.TmdbResponse

@Dao
interface MovieInfoDao {
    @Query("SELECT * FROM tmdbresponse WHERE page = :page")
    suspend fun getPlayingNow(page : Int) : TmdbResponse

    @Query("SELECT * FROM tmdbresponse WHERE page = :page")
    suspend fun getTopRated(page : Int) : TmdbResponse

}