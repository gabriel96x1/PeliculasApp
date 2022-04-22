package com.rzs.peliculasapp.di

import android.app.Application
import androidx.room.Room
import com.rzs.peliculasapp.data.data_source.MovieInfoDatabase
import com.rzs.peliculasapp.data.repository.MoviesRepositoryImpl
import com.rzs.peliculasapp.domain.repository.MovieRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideMovieInfoDatabase(app: Application): MovieInfoDatabase {
        return Room.databaseBuilder(
            app,
            MovieInfoDatabase::class.java,
            MovieInfoDatabase.DATABASE_NAME
        ).build()
    }

    @Provides
    @Singleton
    fun provideMovieRepository(db: MovieInfoDatabase): MovieRepository {
        return MoviesRepositoryImpl(db.movieInfoDao)
    }
}