package com.oscargil80.tutorialrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.oscargil80.tutorialrecyclerview.adapter.SuperHeroAdapter
import com.oscargil80.tutorialrecyclerview.databinding.ActivityMainBinding
import kotlinx.coroutines.flow.collect

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
         setContentView(binding.root)

        val viewModel: SuperHeroViewModel by viewModels()

      val rvAdapter = SuperHeroAdapter()

        binding.rvSuperHero.apply {
          // layoutManager = GridLayoutManager(this@MainActivity, 2)
             layoutManager =LinearLayoutManager(this@MainActivity)
            adapter = rvAdapter
        }

          lifecycleScope.launchWhenStarted {
                viewModel.superHeroList.collect {
                    rvAdapter.submitList(it)
                }
          }
    }

  /*  private fun initRecyclerView() {
        binding.rvSuperHero.layoutManager = LinearLayoutManager(this)
        binding.rvSuperHero.adapter = SuperHeroAdapter()
    }*/
}