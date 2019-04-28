package com.example.vogueladatabinding

import android.databinding.BaseObservable
import android.databinding.Bindable


class TemperatureData(private var location: String, private var celsius: String) : BaseObservable() {


    @Bindable
    fun getCelsius(): String {
        return celsius
    }

    @Bindable
    fun getLocation(): String {
        return location
    }

    fun setLocation(location: String) {
        this.location = location;
        notifyPropertyChanged(BR.location)
    }

    fun setCelsius(celsius: String) {
        this.celsius = celsius;
        notifyPropertyChanged(BR.celsius)
    }

}