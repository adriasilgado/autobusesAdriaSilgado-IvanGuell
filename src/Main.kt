import java.util.Scanner

val conductores = mutableListOf<Conductor>()
val scan = Scanner(System.`in`)

/**
 *
 * @author Iván Güell.
 *
 * Función principal que inicializa la lista de autobuses y llama a la función del menú.
 *
 */
fun main() {
    val autobuses = mutableListOf<Autobuses>()
    menu(autobuses)
    return
}

/**
 *
 * @author Iván Güell.
 *
 * Función que muestra el menú principal y permite al usuario seleccionar diferentes opciones.
 *
 * @param autobuses Lista mutable de autobuses.
 *
 */
fun menu(autobuses: MutableList<Autobuses>) {
    var salir = false
    while (!salir) {
        println(
            """ 
                Menú
        Seleccione una opción: 
        1. Alta de conductores
        2. Alta de autobuses
        3. Comprar billete
        4. Listar autobuses
        5. Listar conductores
        6. Salir""".trimIndent())

        val opcion = scan.nextInt()
        scan.nextLine()
        salir = opcionesMenu(opcion, autobuses)
    }
}

/**
 *
 * @author Iván Güell.
 *
 * Función que maneja las opciones del menú principal.
 *
 * @param opcion Número correspondiente a la opción seleccionada por el usuario.
 * @param autobuses Lista mutable de autobuses.
 * @return Valor booleano que indica si se debe salir del programa.
 *
 */
fun opcionesMenu(opcion: Int, autobuses: MutableList<Autobuses>): Boolean {
    var salir = false
    when (opcion) {
        1 -> altaConductor(conductores)
        2 -> altaAutobus(autobuses)
        3 -> comprarBillete(autobuses, conductores)
        4 -> listarAutobuses(autobuses)
        5 -> listarConductores(conductores)
        6 -> {
            println("Saliendo del programa. ¡Hasta luego!")
            salir = true
        }

        else -> {
            println("Opción no válida. Por favor, seleccione una opción válida.")
        }
    }
    return salir
}

/**
 *
 * @author Iván Güell.
 *
 * Función para agregar un conductor a la lista de conductores.
 *
 * @param conductores Lista mutable de conductores.
 *
 */
fun altaConductor(conductores: MutableList<Conductor>) {
    print("Ingrese el nombre del conductor: ")
    val nombre = scan.nextLine()
    print("Ingrese el salario del conductor: ")
    val salario = scan.nextDouble()

    val conductor = Conductor(nombre, salario)
    conductores.add(conductor)

    println("Conductor agregado exitosamente.")
}

/**
 *
 * @author Iván Güell.
 *
 * Función para agregar un autobús a la lista de autobuses.
 *
 * @param autobuses Lista mutable de autobuses.
 *
 */
fun altaAutobus(autobuses: MutableList<Autobuses>) {
    print("Ingrese el número de identificación del autobús: ")
    val numeroId = scan.nextInt()
    print("Ingrese el precio base del autobús: ")
    val precioBase = scan.nextDouble()

    println("\nSeleccione el tipo de autobús:")
    println("1. Autobús Interurbano")
    println("2. Autobús Urbano")
    print("Ingrese su elección: ")
    val tipoAutobus = scan.nextInt()

    tipoAutobus(tipoAutobus, numeroId, precioBase, autobuses)
}

/**
 *
 * @author Iván Güell.
 *
 * Función para seleccionar el tipo de autobús y agregarlo a la lista de autobuses.
 *
 * @param tipoAutobus Número correspondiente al tipo de autobús seleccionado.
 * @param numeroId Número de identificación del autobús.
 * @param precioBase Precio base del autobús.
 * @param autobuses Lista mutable de autobuses.
 *
 */
fun tipoAutobus(tipoAutobus: Int, numeroId: Int, precioBase: Double, autobuses: MutableList<Autobuses>) {
    when (tipoAutobus) {
        1 -> {
            print("Ingrese los kilómetros del autobús interurbano: ")
            val kilometros = scan.nextDouble()
            val autobusInterurbano = AutobusInterurbano(numeroId, obtenerConductor(), precioBase, kilometros)
            autobuses.add(autobusInterurbano)
            println("Autobús Interurbano agregado exitosamente.")
        }
        2 -> {
            print("Ingrese la ruta del autobús urbano (A o B): ")
            val ruta = scan.next()
            val autobusUrbano = AutobusUrbano(numeroId, obtenerConductor(), precioBase, ruta)
            autobuses.add(autobusUrbano)
            println("Autobús Urbano agregado exitosamente.")
        }else -> println("Opción no válida. No se ha agregado ningún autobús.")
    }
}

/**
 *
 * @author Iván Güell.
 *
 * Función para realizar la compra de un billete.
 *
 * @param autobuses Lista de autobuses disponibles.
 * @param conductores Lista de conductores disponibles.
 *
 */
fun comprarBillete(autobuses: List<Autobuses>, conductores: List<Conductor>) {
    println("\nSeleccione el autobús para comprar el billete:")
    for ((index, autobus) in autobuses.withIndex()) {
        println("${index + 1}. Autobús ID: ${autobus.get_NumeroID()}")
    }

    print("Ingrese el número correspondiente al autobús: ")
    val seleccion = scan.nextInt() - 1

    detallesCompra(seleccion, autobuses)
}

/**
 *
 * @author Iván Güell.
 *
 * Función para mostrar los detalles de la compra realizada.
 *
 * @param seleccion Índice del autobús seleccionado.
 * @param autobuses Lista de autobuses disponibles.
 *
 */
fun detallesCompra(seleccion: Int, autobuses: List<Autobuses>) {
    if (seleccion in 0 until autobuses.size) {
        val autobusSeleccionado = autobuses[seleccion]
        val conductor = autobusSeleccionado.get_Conductor()
        val precioBillete = autobusSeleccionado.calcularPrecio()

        println("\nDetalles de la compra:")
        println("Número de identificación del autobús: ${autobusSeleccionado.get_NumeroID()}")
        println("Nombre del conductor: ${conductor.get_Nom()}")
        println("Precio del billete: $precioBillete")
    } else {
        println("Opción no válida. No se ha realizado ninguna compra.")
    }
}

/**
 *
 * @author Iván Güell.
 *
 * Función para obtener un conductor seleccionado por el usuario.
 *
 * @return Conductor seleccionado.
 *
 */
fun obtenerConductor(): Conductor {
    println("\nSeleccione un conductor para el autobús:")
    for ((index, conductor) in conductores.withIndex()) {
        println("${index + 1}. Conductor: ${conductor.get_Nom()}")
    }

    print("Ingrese el número correspondiente al conductor: ")
    val seleccion = scan.nextInt() - 1

    return if (seleccion in 0 until conductores.size) {
        conductores[seleccion]
    } else {
        println("Opción no válida. Se asignará un conductor por defecto.")
        Conductor("Conductor por defecto", 0.0)
    }
}

/**
 *
 * @author Iván Güell.
 *
 * Función para listar los autobuses almacenados en la lista.
 *
 * @param autobuses Lista de autobuses disponibles.
 *
 */
fun listarAutobuses(autobuses: List<Autobuses>) {
    println("\nListado de Autobuses:")
    for ((index, autobus) in autobuses.withIndex()) {
        println("${index + 1}. $autobus")
    }
}

/**
 *
 * @author Iván Güell.
 *
 * Función para listar los conductores almacenados en la lista.
 *
 * @param conductores Lista de conductores disponibles.
 *
 */
fun listarConductores(conductores: List<Conductor>) {
    println("\nListado de Conductores:")
    for ((index, conductor) in conductores.withIndex()) {
        println("${index + 1}. $conductor")
    }
}
