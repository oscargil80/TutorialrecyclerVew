package com.oscargil80.tutorialrecyclerview.adapter

import androidx.recyclerview.widget.DiffUtil
import com.oscargil80.tutorialrecyclerview.SuperHero

class SuperHeroDiffUtil(
    private val oldList: List<SuperHero>,
    private val newList: List<SuperHero>
) : DiffUtil.Callback() {
    override fun getOldListSize(): Int = oldList.size

   override fun getNewListSize(): Int = newList.size

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
       return oldList[oldItemPosition].realName == newList[  newItemPosition].realName
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return  oldList[oldItemPosition] == newList[newItemPosition]
    }
}