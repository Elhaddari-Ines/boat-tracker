package com.example.e17010346.myapplication

import java.io.Serializable

class ContainerShip {
    data class ContainershipData(
        var id: Int? = 0,
        var name: String? = "",
        var captainName: String? = "",
        var latitude: Float? = 0.0f,
        var longitude: Float? = 0.0f,
        var port: Port? = Port(),
        var type: ContainerShipType? = ContainerShipType(),
        var containers: List<Container>? = listOf()
    ) : Serializable {


    }
}