package com.example.actclase

class Planeta (var nombre:String , var tipo:String, var masa: Double) {

    constructor(): this("La Tierra","Normal",2200.0)

    override fun toString(): String {
        return "Soy el planeta $nombre , de tipo $tipo y mi masa es $masa "
    }

    fun setNombre (n:String){
        nombre=n
    }




}