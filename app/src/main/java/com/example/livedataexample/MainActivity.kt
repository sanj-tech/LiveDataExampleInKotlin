package com.example.livedataexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.livedataexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var mainViewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        mainViewModel=ViewModelProvider(this).get(MainViewModel::class.java)

        mainViewModel.liveData.observe(this, Observer {
            binding.tvText.text=it
        })
        binding.btnUpdate.setOnClickListener({
            mainViewModel.updateLiveData()
        })
    }
}