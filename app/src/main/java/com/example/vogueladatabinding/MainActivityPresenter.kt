package com.example.vogueladatabinding

import android.content.Context;
import android.support.v4.content.ContextCompat.startActivity
import android.content.Intent




class MainActivityPresenter(
    val view: MainActivityContract.View,
    val ctx: Context
) : MainActivityContract.Presenter {


    override fun onShowData(temperatureData: TemperatureData) {
        view.showData(temperatureData)

    }

    override fun showList() {
        val i = Intent(ctx, SecondActivity::class.java)
        ctx.startActivity(i)
    }
}