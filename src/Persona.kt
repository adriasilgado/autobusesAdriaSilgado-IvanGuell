abstract class Persona {
    var nom: String

    constructor(nom: String) {
        this.nom = nom
    }
    fun set_Nom(nom: String) {
        this.nom = nom
    }
    fun get_Nom(): String  {
        return nom
    }
    override fun toString(): String {
        val info = "Persona [Nombre: $nom]"
        return info
    }
}
