
import java.util.*

val conductores = mutableListOf<Conductor>()
val scan = Scanner(System.`in`)

fun main() {
    val autobuses = mutableListOf<Autobuses>()

    while (true) {
        println("\nMenú:")
        println("1. Alta de conductores")
        println("2. Alta de autobuses")
        println("3. Comprar billete")
        println("4. Listar autobuses")
        println("5. Listar conductores")
        println("6. Salir")

        print("Seleccione una opción: ")
        val opcion = scan.nextInt()
        scan.nextLine()

        when (opcion) {
            1 -> altaConductor(conductores)
            2 -> altaAutobus(autobuses)
            3 -> comprarBillete(autobuses, conductores)
            4 -> listarAutobuses(autobuses)
            5 -> listarConductores(conductores)
            6 -> {
                println("Saliendo del programa. ¡Hasta luego!")
                return
            }
            else -> println("Opción no válida. Por favor, seleccione una opción válida.")
        }
    }
}
fun altaConductor(conductores: MutableList<Conductor>) {
    print("Ingrese el nombre del conductor: ")
    val nombre = scan.nextLine()
    print("Ingrese el salario del conductor: ")
    val salario = scan.nextDouble()

    val conductor = Conductor(nombre, salario)
    conductores.add(conductor)

    println("Conductor agregado exitosamente.")
}
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
        }
        else -> println("Opción no válida. No se ha agregado ningún autobús.")
    }
}

fun comprarBillete(autobuses: List<Autobuses>, conductores: List<Conductor>) {
    println("\nSeleccione el autobús para comprar el billete:")
    for ((index, autobus) in autobuses.withIndex()) {
        println("${index + 1}. Autobús ID: ${autobus.numero_id}")
    }

    print("Ingrese el número correspondiente al autobús: ")
    val seleccion = scan.nextInt() - 1

    if (seleccion in 0 until autobuses.size) {
        val autobusSeleccionado = autobuses[seleccion]
        val conductor = autobusSeleccionado.conductor
        val precioBillete = autobusSeleccionado.calcularPrecio()

        println("\nDetalles de la compra:")
        println("Número de identificación del autobús: ${autobusSeleccionado.numero_id}")
        println("Nombre del conductor: ${conductor.nom}")
        println("Precio del billete: $precioBillete")
    } else {
        println("Opción no válida. No se ha realizado ninguna compra.")
    }
}

fun obtenerConductor(): Conductor {
    println("\nSeleccione un conductor para el autobús:")
    for ((index, conductor) in conductores.withIndex()) {
        println("${index + 1}. Conductor: ${conductor.nom}")
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


fun listarAutobuses(autobuses: List<Autobuses>) {
    println("\nListado de Autobuses:")
    for ((index, autobus) in autobuses.withIndex()) {
        println("${index + 1}. $autobus")
    }
}

fun listarConductores(conductores: List<Conductor>) {
    println("\nListado de Conductores:")
    for ((index, conductor) in conductores.withIndex()) {
        println("${index + 1}. $conductor")
    }
}