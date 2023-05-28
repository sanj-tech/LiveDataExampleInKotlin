package com.example.livedataexample

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
//    val student = MutableLiveData<String>("Hello")
//
//
//    fun updateLiveData(){
//        student.value="Sanj"

    val liveDataInfo = MutableLiveData<String>("Hi")

    val liveData: LiveData<String>
        get() = liveDataInfo

    fun updateLiveData() {
        liveDataInfo.value = "Sanj"


    }
}





