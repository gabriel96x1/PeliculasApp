package com.rzs.peliculasapp.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.rzs.peliculasapp.data.repository.MoviesRepositoryImpl
import com.rzs.peliculasapp.domain.model.MovieInfo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

//@HiltViewModel
class MainViewModel( //@Inject constructor(
    //private val moviesRepositoryImpl: MoviesRepositoryImpl
): ViewModel() {

    var _playingNowList : MutableLiveData<List<MovieInfo>> = MutableLiveData()
    var _topRatedList : MutableLiveData<List<MovieInfo>> = MutableLiveData()

    fun getPlayingNowList(page : Int) {
        viewModelScope.launch {
            //val data = moviesRepositoryImpl.getPlayingNow(1)
            //_playingNowList.value = data.results
        }
    }

    fun getTopRatedList(page : Int) {
        viewModelScope.launch {
            //val data = moviesRepositoryImpl.getTopRated(1)
            //_topRatedList.value = data.results
        }
    }
}