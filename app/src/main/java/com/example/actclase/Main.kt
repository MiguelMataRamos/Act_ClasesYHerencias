package com.example.actclase

fun main(){
    //EJERCICIO 1 (PLANETA)
//    var p = Planeta()
//    var p2 = Planeta("marte","nose",20.0)
//    println(p2.toString())
//    println(p.explotar())


    //EJERCICIO 2 (TRIANGULO)
//    val triangulo1 = Triangulo(3.0, 4.0, 5.0)
//    println("Triángulo 1:")
//    println("Perímetro: "+triangulo1.perimetro)
//    println("Tipo: "+triangulo1.tipo)
//    println("¿Es rectángulo? "+triangulo1.esRectangulo())
//
//    val triangulo2 = Triangulo(2.0, 2.0, 3.0)
//    println("Triángulo 2:")
//    println("Perímetro: "+triangulo2.perimetro)
//    println("Tipo: "+triangulo2.tipo)
//    println("¿Es rectángulo? "+triangulo2.esRectangulo())


    //EJERCICIO 3 (Contactos)
//    var contactos = ListaContactos()
//    var yo = Contacto("Miguel","+34672368367","mataramosmiguel@gmail.com")
//    contactos.anadir(yo)
//    contactos.anadir("Paco Mecanico","+34696968726","personasdecompañia@itunes.com")
//    contactos.verContactos()
//    contactos.borrar("Paco Mecanico")
//    contactos.verContactos()

    //EJERCICIO 4
//    var estudiante = Estudiante("Nombre",21,9.99)
//    var clase = Estudiantes()
//    clase.agregar(estudiante)
//    clase.agregar("Nombre2",4,7.8)
//    clase.calcularMedia()
//    clase.mostrar("Nombre2")

    //EJERCICIO 5
//    var producto = Producto("Producto",2.43,19)
//    var inventario = Inventario()
//    inventario.agregar("Producto2",1.99,150)
//    inventario.agregar(producto)
//    inventario.mostrarInventario()
//    inventario.actStock("Producto2",10)
//    inventario.mostrarInventario()


    //EJERCICIO 6
//    (HECHO EN CLASE SISTEMA SOLAR)

    //Ejercicio 7
//    var s = SistemaSolar()
//    s.mostrarInfo()

    //Ejercicio 8
//    s.mostrarPorLetra('M')

    //Ejercicio 9
//    s.gaseosoMasa20Veces()

    //Ejercicio 10
//    s.masaMedia()


    //Ejercicio 11. Crea la clase equipo de fútbol que contenga el nombre y país del equipo


    //Ejercicio 12. Crea una lista con 16 equipos de fútbol de países distintos (no puede
    //haber más de cuatro equipos por país)
    var equipos = mutableListOf<EquipoFutbol>(
        EquipoFutbol("Arenas","España"),
        EquipoFutbol("Arenas","España"),
        EquipoFutbol("Arenas","España"),
        EquipoFutbol("Arenas","España"),

        EquipoFutbol("Arenas","Francia"),
        EquipoFutbol("Arenas","Francia"),
        EquipoFutbol("Arenas","Francia"),
        EquipoFutbol("Arenas","Francia"),

        EquipoFutbol("Arenas","Alemania"),
        EquipoFutbol("Arenas","Alemania"),
        EquipoFutbol("Arenas","Alemania"),
        EquipoFutbol("Arenas","Alemania"),

        EquipoFutbol("Arenas","Unggria"),
        EquipoFutbol("Arenas","Unggria"),
        EquipoFutbol("Arenas","Unggria"),
        EquipoFutbol("Arenas","Unggria"),
    )


    //Ejercicio 13. Crea la función championsLeagueque recibe como entrada la lista con
    //los 16 equipos y muestra por pantalla un sorteo de octavos* de final de la Champions.
    //*(no tengas en cuenta que equipos de un mismo país no pueden enfrentarse)

}