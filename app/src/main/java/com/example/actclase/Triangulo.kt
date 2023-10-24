package com.example.actclase

class Triangulo (var lado1 : Double,var lado2 : Double,var lado3 : Double){
    var perimetro : Double = lado1 + lado2 + lado3
    var tipo : String = when {
        lado1 == lado2 && lado2 == lado3 -> "Equilatero"
        lado1 == lado2 || lado2 == lado3 -> "Isosceles"
        else -> "Escaleno"
    }

    /*
    fun tipoTriangulo(){
        if (lado1 == lado2 && lado2 == lado3){
            tipo = "Equilatero"
        }else if (lado1 == lado2 || lado2 == lado3){
            tipo = "Isosceles"
        }else{
            tipo =  "Escaleno"
        }
    }
     */



}