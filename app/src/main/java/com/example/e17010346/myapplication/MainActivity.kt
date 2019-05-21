package com.example.e17010346.myapplication

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var containerShip: ListView?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.main_containerShipList)

        listView.adapter = MyCustomAdapter(this)
    }

    private class MyCustomAdapter(context: Context): BaseAdapter() {

        private val mContext: Context

        //about the names of boats
        private  val vnameBoat = arrayListOf<String>(
            "Providence", "Argo", "Calypso", "Arcadia", "Epomeo"
        )

        private val vnameCaptain = arrayListOf<String>(
            "Captain Nemo", "Captain Iglo", "Captain Phasma", "Captain Haddock", "Captain Mike Yates"
        )

        init {
            mContext = context
        }

//        fun Context.toast(message: CharSequence) =
//            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

        // how many rows in my list
        override fun getCount(): Int {
            return vnameBoat.size
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getItem(position: Int): Any {
            return "TEST STRING"
        }

        // rendering out each row
        override fun getView(position: Int, convertView: View?, viewGroup: ViewGroup?): View {
            val layoutInflater = LayoutInflater.from(mContext)
            val rowMain = layoutInflater.inflate(R.layout.container, viewGroup, false)

            val nameBoatView = rowMain.findViewById<TextView>(R.id.name)
            nameBoatView.text = vnameBoat.get(position)

            val nameCaptainView = rowMain.findViewById<TextView>(R.id.captainName)
            nameCaptainView.text = vnameCaptain.get(position)

            onClick(nameBoatView)
            return rowMain

        }
        fun onClick(v: View?) {
            Toast.makeText(mContext,"kotlin",Toast.LENGTH_SHORT).show()
        }

    }
}
