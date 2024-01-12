val numMesos = 12
fun laboratoriRatolins(anys:Int): Long {
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
    }
}