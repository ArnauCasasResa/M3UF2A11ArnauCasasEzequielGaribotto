import java.math.BigInteger

/**
 * @author Ezequiel Garibotto
 * @since 12/JAN/2024
 *
 * Aquesta funció calcula la quantitat de parelles de ratolins que hi haurà en passar d'una quantitat N d'anys
 * Utilitzem BigInteger per poder provar amb quantitats d'anys més grans.
 *
 * @param anys quantitat d'anys que passen
 *
 * @return quantitat de parelles que hi haurà passats N anys
 */

fun laboratoriRatolins(anys: Int): BigInteger {
    val numMesos = 12
    tailrec fun laboratoriRatolins(mesos: Int, actual: BigInteger, seguent: BigInteger): BigInteger {
        if (mesos == 0) return actual
        return laboratoriRatolins(mesos - 1, seguent, actual + seguent)
    }
    return laboratoriRatolins(anys * numMesos, BigInteger.ZERO, BigInteger.ONE)
}


fun main() {
    var anys = comprovar("anys")
    while (anys != -1) {
        val parelles = laboratoriRatolins(anys)
        println(parelles)
        anys = comprovar("anys")
        println("Insereix -1 per sortir.")
    }
}