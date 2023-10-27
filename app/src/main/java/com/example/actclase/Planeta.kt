package com.example.actclase

class Planeta {
    var nombre = ""
    var tipo = ""
    var masa = 0.0
    constructor(nombre: String, tipo: String,masa: Double){
        this.nombre=nombre
        this.masa=masa
        var nuevo:String = tipo

        while (nuevo != "Rocoso" || nuevo!= "Gaseoso"){
            println("EL TIPO SOLO PUEDE SER ROCOSO O GASEOSO")
            nuevo = readLine() ?: ""
        }

        this.tipo = nuevo
    }
    constructor(): this("Tierra","Rocoso",2200.0)


    override fun toString(): String {
        return "Soy el planeta $nombre , de tipo $tipo y mi masa es $masa "
    }

    fun explotar ():String {
        return "¡¡¡BUM!!!"
    }

    fun esTipo(tipo: String):Boolean{
        return tipo == this.tipo
    }






}