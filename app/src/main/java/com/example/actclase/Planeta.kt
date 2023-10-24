package com.example.actclase

class Planeta (var nombre:String , var tipo:String, var masa: Double) {
    constructor(): this("Tierra","Normal",2200.0)

    override fun toString(): String {
        return "Soy el planeta $nombre , de tipo $tipo y mi masa es $masa "
    }

    fun explotar ():String {
        return "¡¡¡BUM!!!"
    }

    fun esTipo(tipo: String):Boolean{
        return if (tipo.equals(this.tipo))
    }





}