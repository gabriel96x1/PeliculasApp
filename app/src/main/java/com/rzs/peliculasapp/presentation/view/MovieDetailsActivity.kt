package com.rzs.peliculasapp.presentation.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rzs.peliculasapp.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MovieDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_details)
    }
}