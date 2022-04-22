package com.rzs.peliculasapp.presentation.view

import android.os.Bundle
import android.widget.Adapter
import android.widget.RadioButton
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.rzs.peliculasapp.R
import com.rzs.peliculasapp.databinding.ActivityMainBinding
import com.rzs.peliculasapp.presentation.adapter.MoviesAdapter
import com.rzs.peliculasapp.presentation.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private lateinit var btnPlaying : RadioButton
    private lateinit var btnPopular : RadioButton
    private lateinit var rView: RecyclerView
    private lateinit var adapter: MoviesAdapter
    private lateinit var viewModel: MainViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        btnPlaying = binding.btnPlayingNow
        btnPopular = binding.btnMostPopular
        rView = binding.recycler
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]


        val dummyData: List<String> = listOf("batman","superman","pinguino", "dancer", "flash", "dinosaurios")
        val icon = R.drawable.ic_launcher_foreground

        val dummyImages: List<Int> = listOf(icon,icon,icon,icon,icon,icon)

        adapter = MoviesAdapter( dummyData, dummyImages, 6)
        rView.layoutManager = GridLayoutManager(this,2)
        rView.adapter = adapter
        btnPlaying.isChecked = true

        btnPlaying.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked){
                adapter = MoviesAdapter( dummyData, dummyImages, 6)
                rView.layoutManager = GridLayoutManager(this,2)
                rView.adapter = adapter
                btnPopular.isChecked = false
            }
        }

        btnPopular.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked){
                adapter = MoviesAdapter( dummyData, dummyImages, 6)
                rView.layoutManager = GridLayoutManager(this,3)
                rView.adapter = adapter
                btnPlaying.isChecked = false
            }

        }

    }
}