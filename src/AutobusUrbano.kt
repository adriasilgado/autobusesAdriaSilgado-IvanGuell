class AutobusUrbano : Autobuses {
    var ruta: String

    constructor(numero_id: Int, conductor: Conductor, precio_base: Double, ruta: String) : super(numero_id, conductor, precio_base) {
        this.ruta = ruta
    }

    fun calcularPorcentaje(porcentaje: Double): Double {
        val resultado = precio_base * (porcentaje / 100)
        return resultado
    }
    override fun calcularPrecio(): Double {
        var precioFinal = 0.0

        if (ruta == "A") {
            precioFinal = precio_base + calcularPorcentaje(10.0)
        } else{
            precioFinal = precio_base + calcularPorcentaje(20.0)
        }
    return precioFinal
    }
}