package com.example.vogueladatabinding

import android.content.Context;


class MainActivityPresenter(
    val view: MainActivityContract.View,
    val ctx: Context
) : MainActivityContract.Presenter {
    override fun onShowData(temperatureData: TemperatureData) {
        view.showData(temperatureData)

    }
}