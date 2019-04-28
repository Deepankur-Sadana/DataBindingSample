package com.example.vogueladatabinding

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.example.vogueladatabinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), MainActivityContract.View {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(
            this@MainActivity,
            R.layout.activity_main
        )

        val mainActivityPresenter = MainActivityPresenter(
            this,
            applicationContext
        )
        val temperatureData = TemperatureData(
            "Hamburg",
            "10"
        )
        binding.temp = temperatureData
        binding.presenter = mainActivityPresenter
    }


    override fun showData(temperatureData: TemperatureData) {
        val celsius = temperatureData.getCelsius()
        Toast.makeText(this, celsius, Toast.LENGTH_SHORT).show()
    }

}