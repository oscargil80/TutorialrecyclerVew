package com.oscargil80.tutorialrecyclerview.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.oscargil80.tutorialrecyclerview.R
import com.oscargil80.tutorialrecyclerview.SuperHero

class SuperHeroAdapter(val superherolist: List<SuperHero>) :
    RecyclerView.Adapter<SuperheroViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperheroViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return SuperheroViewHolder(layoutInflater.inflate(R.layout.item_superhero, parent, false))
    }

    override fun onBindViewHolder(holder: SuperheroViewHolder, position: Int) {
        val item = superherolist[position]
        holder.render(item)
    }

    override fun getItemCount(): Int = superherolist.size
}