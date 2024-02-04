class Conductor : Persona {
    var salario: Double

    constructor(nom: String, salario: Double) : super(nom) {
        this.salario = salario
    }
    fun set_salario(salario: Double) {
        this.salario = salario
    }
    fun get_salario(): Double  {
        return salario
    }
    override fun toString(): String {
        val info = "[Nombre: $nom, Salario: $salario]"
        return info
    }
}