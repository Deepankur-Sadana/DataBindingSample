package com.example.vogueladatabinding

interface MainActivityContract {

    interface Presenter {
        fun onShowData(temperatureData: TemperatureData)
    }

    interface View {
        fun showData(temperatureData: TemperatureData)
    }
}