/**
 * #Clase derivada de Autobuses
 *
 * @author Iván Güell.
 *
 * Clase que representa un autobús interurbano, hereda de la clase Autobuses.
 *
 * @property kilometros La distancia en kilómetros del trayecto del autobús interurbano.
 *
 * @constructor Crea un autobús interurbano con un número de identificación, conductor, precio base y kilómetros proporcionados.
 *
 * @param numero_id El número de identificación del autobús interurbano.
 * @param conductor El conductor del autobús interurbano.
 * @param precio_base El precio base del viaje en el autobús interurbano.
 * @param kilometros La distancia en kilómetros del trayecto del autobús interurbano.
 *
 *@inheritance Esta clase hereda de la clase Autobuses, que proporciona propiedades y métodos comunes para manipular autobuses.
 */
class AutobusInterurbano : Autobuses {

   private var kilometros: Double

    /**
     * #Constructor
     *
     * @author Iván Güell.
     *
     * Crea un autobús interurbano con un número de identificación, conductor, precio base y kilómetros proporcionados.
     *
     * @param numero_id El número de identificación del autobús interurbano.
     * @param conductor El conductor del autobús interurbano.
     * @param precio_base El precio base del viaje en el autobús interurbano.
     * @param kilometros La distancia en kilómetros del trayecto del autobús interurbano.
     **
     */
    constructor(numero_id: Int, conductor: Conductor, precio_base: Double, kilometros: Double) : super(numero_id, conductor, precio_base) {
        this.kilometros = kilometros
    }


    // Setters
    /**
     * @author Iván Güell.
     *
     * Establece la distancia en kilómetros del trayecto del autobús interurbano.
     *
     * @param kilometros La nueva distancia en kilómetros del trayecto del autobús interurbano.
     *
     */
    fun set_Kilometros(kilometros: Double) {
        this.kilometros = kilometros
    }


    // Getters
    /**
     * @author Iván Güell.
     *
     * Obtiene la distancia en kilómetros del trayecto del autobús interurbano.
     *
     * @return La distancia en kilómetros actual del trayecto del autobús interurbano.
     *
     */
    fun get_Kilometros(): Double {
        return kilometros
    }

    /**
     * @author Iván Güell.
     *
     * Calcula y devuelve el precio del viaje en el autobús interurbano.
     *
     * @return El precio del viaje en el autobús interurbano.
     *
     */
    override fun calcularPrecio(): Double {
        val precioFinal = precio_base * kilometros
        return precioFinal
    }

    /**
     * @author Iván Güell.
     *
     * Devuelve una cadena que representa la información del autobús interurbano.
     *
     * @return Una cadena con la información del autobús interurbano.
     *
     */
    override fun toString(): String {
        val precioFinal = calcularPrecio()
        val info = "Autobuses: [Numero Identificador: $numero_id, Conductor: $conductor, Precio Base: $precio_base], Kilometros: $kilometros, Precio Trayecto: $precioFinal]"
        return info
    }
}
