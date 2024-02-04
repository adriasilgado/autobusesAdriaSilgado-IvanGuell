abstract class Autobuses {
    var numero_id: Int
    var conductor: Conductor
    var precio_base: Double

    constructor(numero_id: Int, conductor: Conductor, precio_base: Double) {
        this.numero_id = numero_id
        this.conductor = conductor
        this.precio_base = precio_base
    }
    fun set_numeroID(numero_id: Int) {
        this.numero_id = numero_id
    }
    fun get_Rutget_NumeroID(): Int  {
        return numero_id
    }

    fun set_Conductor(conductor: Conductor) {
        this.conductor = conductor
    }
    fun get_Conductor(): Conductor  {
        return conductor
    }

    fun set_PrecioBase(precio_base: Double) {
        this.precio_base = precio_base
    }
    fun get_PrecioBase(): Double  {
        return precio_base
    }
    abstract fun calcularPrecio(): Double

    override fun toString(): String {
        val info = "Autobuses: [Numero Identificador: $numero_id, Conductor: $conductor, Precio Base: $precio_base]"
        return info
    }
}
