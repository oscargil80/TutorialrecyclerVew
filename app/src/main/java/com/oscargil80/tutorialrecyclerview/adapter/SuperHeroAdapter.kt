package com.oscargil80.tutorialrecyclerview.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.oscargil80.tutorialrecyclerview.R
import com.oscargil80.tutorialrecyclerview.SuperHero

class SuperHeroAdapter(

) : ListAdapter<SuperHero, SuperheroViewHolder>(SuperHeroDiffUtil) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperheroViewHolder {
        val layoutInflater: LayoutInflater = LayoutInflater.from(parent.context)
        return SuperheroViewHolder(layoutInflater.inflate(R.layout.item_superhero, parent, false))
    }

    override fun onBindViewHolder(holder: SuperheroViewHolder, position: Int) {
        val item = getItem(position)
        holder.render(item)
    }
}


// RecyclerView.Adapter<SuperheroViewHolder>()