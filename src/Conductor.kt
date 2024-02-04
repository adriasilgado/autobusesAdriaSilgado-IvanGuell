class Conductor : Persona {
    var salario: Double

    constructor(nom: String, salario: Double) : super(nom) {
        this.salario = salario
    }

    override fun toString(): String {
        val info = "[Nombre: $nom, Salario: $salario]"
        return info
    }
}