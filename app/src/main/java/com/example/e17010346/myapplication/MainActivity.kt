package com.example.e17010346.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.e17010346.myapplication.R.layout.container


class MainActivity : AppCompatActivity() {

    var containerShip: ListView?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setContentView(container)
        containerShip = findViewById(R.id.containerShip)
        var adapter = ContainerShipList(this, generateData())
        containerShip?.adapter = adapter

        adapter.notifyDataSetChanged()
    }

    private fun generateData(): ArrayList<ContainerShip>{
        var result = findViewById<ListView>(containerShip)

        for (i in 0..9){
            var ship1 = ContainerShip().toString()
            result.add(ship1)
        }

        return result
    }

}
