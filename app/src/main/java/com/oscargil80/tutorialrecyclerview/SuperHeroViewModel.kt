package com.oscargil80.tutorialrecyclerview

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class SuperHeroViewModel:ViewModel() {

private  var _superHeroList = MutableStateFlow<List<SuperHero>>(emptyList())
    val superHeroList: StateFlow<List<SuperHero>> = _superHeroList

    init {
        _superHeroList.value = SuperHeroProvider.superheroList
    }

}