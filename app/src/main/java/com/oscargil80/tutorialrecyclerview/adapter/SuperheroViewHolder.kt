package com.oscargil80.tutorialrecyclerview.adapter

import android.view.View

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.oscargil80.tutorialrecyclerview.SuperHero
import com.oscargil80.tutorialrecyclerview.databinding.ItemSuperheroBinding

class SuperheroViewHolder (view: View): RecyclerView.ViewHolder(view) {

 val binding = ItemSuperheroBinding.bind(view)
    fun render(supeheroModel:SuperHero){
        binding.tvSuperHeroName.text = supeheroModel.superhero
        binding.tvRealName.text = supeheroModel.realName
        binding.tvPublisher.text = supeheroModel.publisher
        Glide.with(binding.ivSuperHero.context).load(supeheroModel.photo).into(binding.ivSuperHero)
    }

}