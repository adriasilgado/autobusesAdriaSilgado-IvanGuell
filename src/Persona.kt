abstract class Persona {
    var nom: String

    constructor(nom: String) {
        this.nom = nom
    }

    override fun toString(): String {
        val info = "Persona [Nombre: $nom]"
        return info
    }
}
