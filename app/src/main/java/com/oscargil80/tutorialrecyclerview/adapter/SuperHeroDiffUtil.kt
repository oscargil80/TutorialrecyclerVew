package com.oscargil80.tutorialrecyclerview.adapter

import androidx.recyclerview.widget.DiffUtil
import com.oscargil80.tutorialrecyclerview.SuperHero

// Explicacionde diff util
      /*hay dos formas de crearlo el que le vi a aristiudev porque lo vi primero, consiste en crear una clase
      en la misma se tienen que pasar 2 parametros que son listas creadas alli mismo, osea que el mismo lo crea ambas clases se llaman
      diferente olditem y newitem, y ambas reciben un objeto superhero del provider, en este caso se extiende del DiffUtil.Callback y los
      metodos abstractos son faciles de llenar

      En el caso de leoardno morales, extiende del DiffUtil.ItemCallback y se le pasa el Superhero o el objeto,  y solo se sobrescriben 2 metodos
             donde se compara el id y el otro si son diferentes, Creo que es el mas facil */


/*class SuperHeroDiffUtil(
    private val oldList: List<SuperHero>,
    private val newList: List<SuperHero>
) : DiffUtil.Callback() {
    override fun getOldListSize(): Int = oldListSize

   override fun getNewListSize(): Int = newListSize

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
       return oldList[oldItemPosition].realName == newList[  newItemPosition].realName
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return  oldList[oldItemPosition] == newList[newItemPosition]
    }
}*/


object SuperHeroDiffUtil: DiffUtil.ItemCallback<SuperHero>(){

    override fun areItemsTheSame(oldItem: SuperHero, newItem: SuperHero): Boolean {
        return oldItem.realName == newItem.realName
    }

    override fun areContentsTheSame(oldItem: SuperHero, newItem: SuperHero): Boolean {
        return oldItem == newItem
    }

}
