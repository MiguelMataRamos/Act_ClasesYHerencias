package com.example.actclase

class SistemaSolar {
    var lista = mutableListOf<Planeta>(
        Planeta("Tierra","Rocoso",5.0),
        Planeta("Barro","Rocoso",10.0),
        Planeta("Polvo","Gaseoso",1.0),
    )

    fun planetaMayor():Planeta{
        lista.sortBy { it.masa }
        return lista[0]
    }

    fun planetaMenor():Planeta{
        lista.sortByDescending { it.masa }
        return lista[0]
    }

    fun masaMedia():Double{
        var suma = 0.0
        var cont = 0

        for (p in lista){
            suma += p.masa
            cont ++
        }

        var media = suma/cont

        return media
    }

}