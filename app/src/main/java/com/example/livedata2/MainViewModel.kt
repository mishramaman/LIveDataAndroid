package com.example.livedata2

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel:ViewModel() {

    val facts=MutableLiveData<String>("This is Aman Mishra")



    fun update(){
        facts.value="Hey I am Aman Mishra"
    }
}