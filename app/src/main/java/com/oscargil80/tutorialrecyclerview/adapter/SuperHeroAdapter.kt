package com.oscargil80.tutorialrecyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.oscargil80.tutorialrecyclerview.R
import com.oscargil80.tutorialrecyclerview.SuperHero

class SuperHeroAdapter(
    var superherolist: List<SuperHero>,
    private val onClickListener: (SuperHero) -> Unit,
    private val onClickDelete: (Int) -> Unit
) :
    RecyclerView.Adapter<SuperheroViewHolder>() {

    private  lateinit  var con:Context

    fun updateList(newList: List<SuperHero>){
        //Toast.makeText(con, "Hola ${superherolist.size}", Toast.LENGTH_SHORT).show()

        val superheroDiff = SuperHeroDiffUtil(superherolist, newList)
        val result:DiffUtil.DiffResult = DiffUtil.calculateDiff(superheroDiff)

        superherolist = newList
        result.dispatchUpdatesTo(this)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperheroViewHolder {
        con = parent.context
        val layoutInflater = LayoutInflater.from(parent.context)
        return SuperheroViewHolder(layoutInflater.inflate(R.layout.item_superhero, parent, false))
    }

    override fun onBindViewHolder(holder: SuperheroViewHolder, position: Int) {
        val item = superherolist[position]
        holder.render(item, onClickListener, onClickDelete)
    }

    override fun getItemCount(): Int = superherolist.size
}