package com.example.recyclerview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.loyout.activity_main);

        rvNames.layoutManager = LinearLayoutManager(baseContext)
        val namesAdapter = NameRecyclerViewAdapter(listOf("Leila", "Josiah", "Faustine", "Emmanuel", "Samwel", "Eliza",
            "Violet", "Fredrick", "Charles"))
        rvNames.adapter = namesAdapter





    }
}
