package com.example.actclase

import kotlin.math.PI

class Circunferencia(var radio:Double) {
    var centro = mutableListOf<Int>(0,0)

    constructor(radio: Double, centro:MutableList<Int>, punto:MutableList<Int>):this(radio){
        this.centro = centro

        this.radio = ((punto[0]-centro[0])*(punto[0]-centro[0]) + (punto[1] - centro[1]) * (punto[1] - centro[1])).toDouble()

    }

    fun longitud():Double{
        return 2 * PI * radio
    }

    @Override
    override fun toString(): String {
        return "Su radio es de "+longitud()+" y su centro es "+centro.toString()
    }
}