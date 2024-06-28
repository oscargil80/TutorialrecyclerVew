package com.oscargil80.tutorialrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.oscargil80.tutorialrecyclerview.adapter.SuperHeroAdapter
import com.oscargil80.tutorialrecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var superHeroMutableList: MutableList<SuperHero> =
        SuperHeroProvider.superheroList.toMutableList()
    private lateinit var adapter: SuperHeroAdapter
    private  var llManager= LinearLayoutManager(this)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnAdd.setOnClickListener { createSuperHero() }
        initRecyclerView()
    }

    private fun createSuperHero() {
   val superHero =  SuperHero(
       "Oscar Medina",
       "Real Madrid ",
       "El Oscar",
       "https://scontent.fmar6-1.fna.fbcdn.net/v/t1.6435-9/36308728_10213985046753168_8280496865636515840_n.jpg?_nc_cat=105&ccb=1-7&_nc_sid=7b2446&_nc_ohc=FZWkk-gB5XAQ7kNvgHPaJlk&_nc_ht=scontent.fmar6-1.fna&oh=00_AYBHKADveoAFuMuyxmnTbfLIB87oKNNhGPdN4ZhhtrRszw&oe=66A59AB6"
   )
        superHeroMutableList.add(3, superHero )
        adapter.notifyItemInserted(3)
        llManager.scrollToPositionWithOffset(3, 20)

    }

    private fun initRecyclerView() {
        adapter = SuperHeroAdapter(
            superherolist = superHeroMutableList,
            onClickListener = { superhero -> onItemSelected(superhero) },
            onClickDelete = { position -> onItemDeleted(position) })


        binding.rvSuperHero.layoutManager = llManager
        binding.rvSuperHero.adapter = adapter
    }

    private fun onItemDeleted(position: Int) {
        superHeroMutableList.removeAt(position)
        adapter.notifyItemRemoved(position)

    }

    private fun onItemSelected(superHero: SuperHero) {
        Toast.makeText(this, superHero.realName, Toast.LENGTH_SHORT).show()
    }
}