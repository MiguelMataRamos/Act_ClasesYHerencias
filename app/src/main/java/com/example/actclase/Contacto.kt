//Ejercicio 3: Gestión de Contactos
//Crea una clase llamada Contacto que represente la información de un contacto en una lista de
//contactos. La clase debe tener propiedades como nombre, número de teléfono y dirección de
//correo electrónico. Luego, crea una lista de objetos Contacto y permite a los usuarios agregar,
//eliminar y mostrar contactos

package com.example.actclase

class Contacto{
    var nombre = ""
    var telefono = ""
    var email = ""


    constructor(n:String,t: String,e_m: String){
        this.nombre=n
        this.telefono=t
        this.email=e_m
    }

}

class ListaContactos{
    var contactos : MutableList<Contacto> = mutableListOf()

    fun anadir(n:String, t:String, e_m: String){
        var existe = false
        for (c in contactos){
            if (c.nombre==n){
                existe = true
            }
        }

        if (existe){
            println("ESE CONTACTO YA EXISTE")
        }else{
            var nuevo = Contacto(n,t,e_m)
            contactos.add(nuevo)
        }


    }


    fun anadir(contacto: Contacto){
        var existe = false
        for (c in contactos){
            if (c.nombre==contacto.nombre){
                existe = true
            }
        }

        if (existe){
            println("ESE CONTACTO YA EXISTE")
        }else{
            contactos.add(contacto)
        }

    }


    fun borrar(n: String){
        for (c in contactos){
            if (c.nombre == n){
                println(c.nombre+" BORRADO CON EXITO")
                contactos.remove(c)
                return
            }
        }
        println("NO HAY NINGUN CONTACTO CON ESE NOMBRE")
    }

    fun verContactos(){
        if (contactos.isEmpty()){
            println("NO HAY NINGUN CONTACTO EN TU LISTA")
        }else{
            for (c in contactos){
                println("-----------")
                println(c.nombre)
                println(c.telefono)
                println(c.email)
                println("-----------")
            }
        }

    }

}