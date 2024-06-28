package com.oscargil80.tutorialrecyclerview.adapter

import androidx.recyclerview.widget.DiffUtil
import com.oscargil80.tutorialrecyclerview.SuperHero

object SuperHeroDiffUtil: DiffUtil.ItemCallback<SuperHero>(){
    override fun areItemsTheSame(oldItem: SuperHero, newItem: SuperHero): Boolean {
        return oldItem.realName == newItem.realName
    }

    override fun areContentsTheSame(oldItem: SuperHero, newItem: SuperHero): Boolean {
        return oldItem == newItem
    }

}