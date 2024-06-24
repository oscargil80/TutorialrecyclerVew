package com.oscargil80.tutorialrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.oscargil80.tutorialrecyclerview.adapter.SuperHeroAdapter
import com.oscargil80.tutorialrecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
         setContentView(binding.root)
        initRecyclerView()
    }

    private fun initRecyclerView() {
        binding.rvSuperHero.layoutManager = LinearLayoutManager(this)
        binding.rvSuperHero.adapter = SuperHeroAdapter(SuperHeroProvider.superheroList)
    }
}