package com.example.e17010346.myapplication

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class ContainerShipList(private var activity: Activity, private var items: ArrayList<ContainerShip>) : BaseAdapter() {
    private class ViewHolder(row: View?) {
        var name: TextView? = null
        var captainName: TextView? = null

        init {
            this.name = row?.findViewById<TextView>(R.id.name)
            this.captainName = row?.findViewById<TextView>(R.id.captainName)
        }
    }
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View?
        val viewHolder: ViewHolder
        if (convertView == null) {
            val inflater = activity?.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            view = inflater.inflate(R.layout.container, null)
            viewHolder = ViewHolder(view)
            view?.tag = viewHolder
        } else {
            view = convertView
            viewHolder = view.tag as ViewHolder
        }

        var containerShip = items[position]
     /*   viewHolder.name?.text = containerShip.name
        viewHolder.captainName?.text = containerShip.captainName*/

        return view as View
    }

    override fun getItem(position: Int): Any {
        return items[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return items.size
    }

}