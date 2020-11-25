package com.example.praktikummodul8

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

//class penyimpanan data observable berbasis siklus proses
class CommunicationViewModel : ViewModel(){
    private val mName = MutableLiveData<String>()
    val name : LiveData<String>
        get() = mName

    fun setName(name:String){
        mName.value = name
    }
}