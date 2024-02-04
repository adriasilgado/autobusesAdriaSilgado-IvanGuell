/**
 * #Clase Base que proporciona propiedades y métodos comunes para manipular información sobre una persona.
 *
 * @author Adriá Silgado
 *
 * Clase base para representar a una persona.
 *
 * Esta clase proporciona propiedades y métodos comunes para manipular información sobre una persona, como su nombre.
 *
 * @property nom El nombre de la persona.
 *
 * @constructor Crea una persona con el nombre proporcionado.
 *
 * @param nom El nombre de la persona.
 *
 * @method set_Nom() Establece el nombre de la persona.
 * @method get_Nom() Obtiene el nombre de la persona.
 *
 * @method toString() Devuelve una cadena que representa la información de la persona.
 *
 */
abstract class Persona {

    protected var nom: String

    /**
     * @author Adriá Silgado.
     *
     * Crea una persona con el nombre proporcionado.
     *
     * @param nom El nombre de la persona.
     */
    constructor(nom: String) {
        this.nom = nom
    }

    // Setters
    /**
     * @author Iván Güell.
     *
     * Establece el nombre de la persona.
     *
     * @param nom El nuevo nombre de la persona.
     */
    fun set_Nom(nom: String) {
        this.nom = nom
    }

    // Getters
    /**
     * @author Iván Güell.
     *
     * Obtiene el nombre de la persona.
     *
     * @return El nombre actual de la persona.
     */
    fun get_Nom(): String  {
        return nom
    }

    /**
     * @author Iván Güell.
     *
     * Devuelve una cadena que representa la información de la persona.
     *
     * @return Una cadena con el nombre de la persona.
     */
    override fun toString(): String {
        val info = "Persona [Nombre: $nom]"
        return info
    }
}
