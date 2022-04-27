const val PI = 3.1416

fun main(args: Array<String>) {
    //PRIMER Codigo
    println("Hello World!")
    //CREANDO VARIABLES
    var dinero = 10
    println(dinero)
    dinero = 5
    println(dinero)
    val nombre = "Maria"
    println(nombre)
    println(PI)
    // TIPO DE VARIABLES
    val boolean = true;
    val numeroLago = 3L
    val double : Double = 2.713
    val float = 1.1f

    val primerValor = 20
    val segundoValor = 10
    val tercerValor = primerValor - segundoValor
    println(tercerValor)

    val apellido = "miApellido"
    val nombreapp = "miNombre"
    val nombreCompleto = "Mi nombre es $nombreapp y apellido $apellido"
    println(nombreCompleto)
}