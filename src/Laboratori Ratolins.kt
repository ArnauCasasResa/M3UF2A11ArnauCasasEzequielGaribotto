
import java.util.*


fun laboratoriRatolins(anys: Int): Long {
    tailrec fun calcularParelles(mesosRestants: Int, ratolins: Long): Long {
        val parellesFertils = ratolins / 2
        if (mesosRestants == 1) {
            return parellesFertils
        }
        val nousRatolins = parellesFertils * 2

        return calcularParelles(mesosRestants - 1, ratolins + nousRatolins)
    }

    return calcularParelles(anys * 12, ratolins = 2) // Convertimos años a meses, inicialmente hay 2 ratones
}

fun laboratoriRatolinsMesos(mesos: Int): Long {
    tailrec fun calcularParelles(mesosRestants: Int, ratolins: Long): Long {
        val parellesFertils = ratolins / 2
        if (mesosRestants == 1) {
            return parellesFertils
        }
        val nousRatolins = parellesFertils * 2

        return calcularParelles(mesosRestants - 1, ratolins + nousRatolins)
    }

    return calcularParelles(mesos, ratolins = 2)
}
fun main() {
    var sortir = false
    while (!sortir) {
        val anys = comprovar("anys")
        val ratolins = laboratoriRatolins(anys)
        println(ratolins)


        val mesos = comprovar("mesos")
        val ratolinsv2 = laboratoriRatolinsMesos(mesos)
        println(ratolinsv2)
    }
}