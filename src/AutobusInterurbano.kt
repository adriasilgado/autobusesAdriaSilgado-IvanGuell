class AutobusInterurbano : Autobuses {

    var kilometros: Double

    constructor(numero_id: Int, conductor: Conductor, precio_base: Double, kilometros: Double) : super(numero_id, conductor, precio_base) {
        this.kilometros = kilometros
    }

    override fun calcularPrecio() : Double {
        val precioFinal = precio_base * kilometros
        return precioFinal
    }

    override fun toString(): String {
        val precioFinal = calcularPrecio()
        val info = "Autobuses: [Numero Identificador: $numero_id, Conductor: $conductor, Precio Base: $precio_base], Kilometros: $kilometros, Precio Trayecto: $precioFinal]"
        return info
    }
}
