class AutobusUrbano : Autobuses {
    var ruta: String

    constructor(numero_id: Int, conductor: Conductor, precio_base: Double, ruta: String) : super(numero_id, conductor, precio_base) {
        this.ruta = ruta
    }
    fun set_Ruta(ruta: String) {
        this.ruta = ruta
    }
    fun get_Ruta(): String  {
        return ruta
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

    override fun toString(): String {
        val precioFinal = calcularPrecio()
        val info = "Autobuses: [Numero Identificador: $numero_id, Conductor: $conductor, Precio Base: $precio_base], Ruta: $ruta, Precio Trayecto: $precioFinal]"
        return info
    }
}