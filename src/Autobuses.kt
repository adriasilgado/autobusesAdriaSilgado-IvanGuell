abstract class Autobuses {
    var numero_id:Int
    var conductor:Conductor
    var precio_base:Double

    constructor(numero_id:Int, conductor: Conductor, precio_base:Double) {
        this.numero_id = numero_id
        this.conductor = conductor
        this.precio_base = precio_base
    }
}