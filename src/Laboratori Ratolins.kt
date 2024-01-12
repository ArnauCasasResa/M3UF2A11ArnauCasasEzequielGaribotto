/**
 * @author Ezequiel Garibotto
 * @since 12/JAN/2024
 *
 * Aquesta funció calcula la quantitat de parelles de ratolins que hi haurà en passar d'una quantitat N d'anys
 *
 * @param anys quantitat d'anys que passen
 *
 * @return quantitat de parelles de ratolins que hi haurà passats N anys
 */
fun laboratoriRatolins(anys:Int): Long {
    val numMesos = 12
    tailrec fun laboratoriRatolins(mesos: Int, actual: Long, seguent: Long): Long {
        if (mesos == 0) return actual
        return laboratoriRatolins(mesos - 1, seguent, actual + seguent)
    }
    return laboratoriRatolins(anys*numMesos, 0L, 1L)
}

fun main() {
    var anys = comprovar("anys")
    while (anys != -1) {
        val ratolins = laboratoriRatolins(anys)
        println(ratolins)
        anys = comprovar("anys")
        println("Insereix -1 per sortir.")
    }
}