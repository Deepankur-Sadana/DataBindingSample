package com.example.vogueladatabinding

interface MainActivityContract {

    interface Presenter {
        fun onShowData(temperatureData: TemperatureData)
        fun showList()

    }

    interface View {
        fun showData(temperatureData: TemperatureData)
    }
}