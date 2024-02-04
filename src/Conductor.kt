/**
 * #Clase derivada de Persona.
 *
 * @author Adriá Silgado
 *
 * Clase que representa a un conductor, hereda de la clase Persona.
 *
 * @property salario El salario del conductor.
 *
 * @constructor Crea un conductor con un nombre y salario proporcionados.
 *
 * @param nom El nombre del conductor.
 * @param salario El salario del conductor.
 *
 *@inheritance Esta clase hereda de la clase Persona.
 *
 */
class Conductor : Persona {

    private var salario: Double

    /**
     * @author Adriá Silgado.
     *
     * Constructor que crea un conductor con un nombre y salario proporcionados.
     *
     * @param nom El nombre del conductor.
     * @param salario El salario del conductor.
     *
     */
    constructor(nom: String, salario: Double) : super(nom) {
        this.salario = salario
    }

    /**
     * @author Iván Güell.
     *
     * Establece el salario del conductor.
     *
     * @param salario El nuevo salario del conductor.
     *
     */
    fun set_salario(salario: Double) {
        this.salario = salario
    }

    /**
     * @author Iván Güell.
     *
     * Obtiene el salario del conductor.
     *
     * @return El salario actual del conductor.
     *
     */
    fun get_salario(): Double {
        return salario
    }

    /**
     * @author Iván Güell.
     *
     * Devuelve una cadena que representa al conductor con su nombre y salario.
     *
     * @return Una cadena con el nombre y salario del conductor.
     *
     */
    override fun toString(): String {
        val info = "[Nombre: $nom, Salario: $salario]"
        return info
    }
}
