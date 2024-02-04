class AutobusInterurbano : Autobuses {

    var kilometros: Double

    constructor(numero_id: Int, conductor: Conductor, precio_base: Double, kilometros: Double) : super(numero_id, conductor, precio_base) {
        this.kilometros = kilometros
    }

    override fun calcularPrecio() : Double {
        val precioFinal = precio_base * kilometros
        return precioFinal
    }
}
