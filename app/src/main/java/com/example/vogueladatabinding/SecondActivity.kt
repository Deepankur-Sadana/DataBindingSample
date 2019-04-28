package com.example.vogueladatabinding

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import java.util.*


class SecondActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second);
        val recyclerView = findViewById<RecyclerView>(R.id.my_recycler_view)
        recyclerView.setHasFixedSize(true)

        // use a linear layout manager
        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager


        val items = Arrays.asList(
            TemperatureData("Hamburg", "5"),
            TemperatureData("Berlin", "6")
        )

        // define an adapter
        val mAdapter = MyAdapter(items)
        recyclerView.adapter = mAdapter


    }
}