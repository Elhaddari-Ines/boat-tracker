package com.example.e17010346.myapplication

import android.graphics.ColorSpace
import android.widget.ArrayAdapter

class ContainerShip(
    val id: Int,
    val name: String,
    val captainName: String,
    val lagitude: Float,
    val longitude: Float,
    val port: Port,
    val type: ContainerShipType,
    val Containers: List<Container>
): ArrayAdapter<Container>(){}