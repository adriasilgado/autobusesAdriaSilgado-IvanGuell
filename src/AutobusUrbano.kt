/**
 * #Clase derivada de Autobuses
 *
 * @author Iván Güell.
 *
 * Clase que representa un autobús urbano, hereda de la clase Autobuses.
 *
 * @property ruta La ruta del autobús urbano.
 *
 * @constructor Crea un autobús urbano con un número de identificación, conductor, precio base y ruta proporcionados.
 *
 * @param numero_id El número de identificación del autobús urbano.
 * @param conductor El conductor del autobús urbano.
 * @param precio_base El precio base del viaje en el autobús urbano.
 * @param ruta La ruta del autobús urbano.
 *
 * @inheritance Esta clase hereda de la clase Autobuses, que proporciona propiedades y métodos comunes para manipular autobuses.
 *
 */
class AutobusUrbano : Autobuses {

   private var ruta: String

    /**
     * @author Iván Güell.
     *
     * Crea un autobús urbano con un número de identificación, conductor, precio base y ruta proporcionados.
     *
     * @param numero_id El número de identificación del autobús urbano.
     * @param conductor El conductor del autobús urbano.
     * @param precio_base El precio base del viaje en el autobús urbano.
     * @param ruta La ruta del autobús urbano.
     *
     */
    constructor(numero_id: Int, conductor: Conductor, precio_base: Double, ruta: String) : super(numero_id, conductor, precio_base) {
        this.ruta = ruta
    }

    /**
     * @author Iván Güell.
     *
     * Establece la ruta del autobús urbano.
     *
     * @param ruta La nueva ruta del autobús urbano.
     *
     */
    fun set_Ruta(ruta: String) {
        this.ruta = ruta
    }

    /**
     * @author Iván Güell.
     *
     * Obtiene la ruta del autobús urbano.
     *
     * @return La ruta actual del autobús urbano.
     *
     */
    fun get_Ruta(): String  {
        return ruta
    }

    /**
     * @author Iván Güell.
     *
     * Calcula el porcentaje del precio base según el porcentaje proporcionado.
     *
     * @param porcentaje El porcentaje a calcular.
     * @return El resultado del cálculo.
     *
     */
    fun calcularPorcentaje(porcentaje: Double): Double {
        val resultado = precio_base * (porcentaje / 100)
        return resultado
    }

    /**
     * @author Iván Güell.
     *
     * Calcula y devuelve el precio del viaje en el autobús urbano.
     *
     * @return El precio del viaje en el autobús urbano.
     *
     */
    override fun calcularPrecio(): Double {
        var precioFinal = 0.0

        if (ruta == "A") {
            precioFinal = precio_base + calcularPorcentaje(10.0)
        } else {
            precioFinal = precio_base + calcularPorcentaje(20.0)
        }
        return precioFinal
    }


    /**
     * @author Iván Güell.
     *
     * Devuelve una cadena que representa la información del autobús urbano.
     *
     * @return Una cadena con la información del autobús urbano.
     *
     */
    override fun toString(): String {
        val precioFinal = calcularPrecio()
        val info = "Autobuses: [Numero Identificador: $numero_id, Conductor: $conductor, Precio Base: $precio_base], Ruta: $ruta, Precio Trayecto: $precioFinal]"
        return info
    }
}
