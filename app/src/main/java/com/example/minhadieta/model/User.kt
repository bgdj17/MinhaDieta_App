package com.example.minhadieta.model

data class User(val ID: Int , val nameUser: String, val heightUser : Double, val wheightUser: Double){

    fun getImc(): Double {
        var imc = wheightUser / (heightUser * heightUser)
        return imc
    }

    fun getWater(): Double {
        var water = wheightUser * 35
        return water
    }
}
