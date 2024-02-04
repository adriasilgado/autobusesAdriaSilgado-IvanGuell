/**
 * #Clase Base que proporciona propiedades y métodos comunes para manipular autobuses.
 *
 * @author Adriá Silgado.
 *
 * Clase abstracta base que representa autobuses en general.
 *
 * @property numero_id El número de identificación del autobús.
 * @property conductor El conductor del autobús.
 * @property precio_base El precio base del viaje en el autobús.
 *
 * @constructor Crea un autobús con un número de identificación, conductor y precio base proporcionados.
 *
 * @param numero_id El número de identificación del autobús.
 * @param conductor El conductor del autobús.
 * @param precio_base El precio base del viaje en el autobús.
 */
abstract class Autobuses {


    protected var numero_id: Int
    protected var conductor: Conductor
    protected var precio_base: Double

    /**
     * @author Adriá Ssilgado
     *
     * Crea un autobús con un número de identificación, conductor y precio base proporcionados.
     *
     * @param numero_id El número de identificación del autobús.
     * @param conductor El conductor del autobús.
     * @param precio_base El precio base del viaje en el autobús.
     */
    constructor(numero_id: Int, conductor: Conductor, precio_base: Double) {
        this.numero_id = numero_id
        this.conductor = conductor
        this.precio_base = precio_base
    }

    /**
     * @author Iván Güell.
     *
     * Establece el número de identificación del autobús.
     *
     * @param numero_id El nuevo número de identificación del autobús.
     */
    fun set_numeroID(numero_id: Int) {
        this.numero_id = numero_id
    }

    /**
     * @author Iván Güell.
     *
     * Obtiene el número de identificación del autobús.
     *
     * @return El número de identificación actual del autobús.
     */
    fun get_NumeroID(): Int {
        return numero_id
    }

    /**
     * @author Iván Güell.
     *
     * Establece el conductor del autobús.
     *
     * @param conductor El nuevo conductor del autobús.
     */
    fun set_Conductor(conductor: Conductor) {
        this.conductor = conductor
    }

    /**
     * @author Iván Güell.
     *
     * Obtiene el conductor del autobús.
     *
     * @return El conductor actual del autobús.
     */
    fun get_Conductor(): Conductor {
        return conductor
    }

    /**
     * @author Iván Güell.
     *
     * Establece el precio base del viaje en el autobús.
     *
     * @param precio_base El nuevo precio base del viaje en el autobús.
     */
    fun set_PrecioBase(precio_base: Double) {
        this.precio_base = precio_base
    }

    /**
     * @author Iván Güell.
     *
     * Obtiene el precio base del viaje en el autobús.
     *
     * @return El precio base actual del viaje en el autobús.
     */
    fun get_PrecioBase(): Double {
        return precio_base
    }

    /**
     * @author Iván Güell.
     *
     * Calcula y devuelve el precio del viaje en el autobús.
     *
     * @return El precio del viaje en el autobús.
     */
    abstract fun calcularPrecio(): Double

    /**
     * @author Iván Güell.
     *
     * Devuelve una cadena que representa la información del autobús.
     *
     * @return Una cadena con la información del autobús.
     */
    override fun toString(): String {
        val info = "Autobuses: [Numero Identificador: $numero_id, Conductor: $conductor, Precio Base: $precio_base]"
        return info
    }
}
