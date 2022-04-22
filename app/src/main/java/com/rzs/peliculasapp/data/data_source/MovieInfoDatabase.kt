package com.rzs.peliculasapp.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.rzs.peliculasapp.domain.model.MovieInfo
import com.rzs.peliculasapp.domain.model.TmdbResponse

@Database(
    entities = [MovieInfo::class, TmdbResponse::class],
    version = 1
)
abstract class MovieInfoDatabase : RoomDatabase() {

    abstract val movieInfoDao: MovieInfoDao

    companion object {
        const val DATABASE_NAME = "move_info_db"
    }
}