//Ejercicio 5: Control de Inventario
//Crea una clase Producto que represente productos en un inventario. La clase debe tener
//propiedades como nombre del producto, precio y cantidad en stock. Luego, crea una lista de
//objetos Producto y permite a los usuarios agregar nuevos productos, actualizar el stock y
//mostrar el inventario.

package com.example.actclase

class Producto {
    var nombre = ""
    var precio = 0.0
    var stock = 0

    constructor(n:String, p:Double, s:Int){
        this.nombre=n
        this.precio=p
        this.stock=s
    }
}

class Inventario{
    var productos : MutableList<Producto> = mutableListOf()

    fun agregar(n:String, p:Double, s:Int){
        var nuevo = Producto(n,p,s)
        productos.add(nuevo)
    }
    fun agregar(p:Producto){
        productos.add(p)
    }

    fun actStock(nombre:String, stock:Int){
        for (p in productos){
            if (p.nombre==nombre){
                p.stock=stock
            }
        }
    }

    fun mostrarInventario(){
        for (p in productos){
            println("--------------------------")
            println(p.nombre)
            println(p.precio)
            println(p.stock)
            println("--------------------------")
        }
    }


}