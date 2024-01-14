/**
 * @author Ezequiel Garibotto
 * @since 12/JAN/2024
 *
 * Aquesta funció pinta una regió d'una matriu donades la matriu i dues coordenades.
 * Es pinta una cella adjacent quan és a dalt, a sota, a l'esquerra o a la dreta
 * de la posició (posX, posY) de manera recursiva.
 *
 * @param matriu matriu que es vol pintar
 * @param posX posició posX a la que es vol pintar
 * @param posY posició posY a la que es vol pintar
 *
 * @return matriu amb la regió pintada
 */
fun pintarRegio(matriu: Array<Array<Int>>, posX: Int, posY: Int) {
    if (posX in matriu.indices && posY in matriu[0].indices && matriu[posX][posY] == 1) {
        matriu[posX][posY] = 2

        pintarRegio(matriu, posX + 1, posY)
        pintarRegio(matriu, posX - 1, posY)
        pintarRegio(matriu, posX, posY + 1)
        pintarRegio(matriu, posX, posY - 1)
    }
}

val matriu = arrayOf(
    arrayOf(0, 1, 1, 1, 0, 1, 0, 0),
    arrayOf(0, 0, 1, 0, 0, 1, 0, 1),
    arrayOf(0, 1, 1, 1, 0, 1, 0, 1),
    arrayOf(0, 1, 1, 0, 0, 1, 0, 0),
    arrayOf(0, 0, 1, 1, 0, 1, 1, 1),
    arrayOf(0, 0, 0, 0, 0, 1, 0, 0),
    arrayOf(1, 1, 1, 1, 1, 1, 1, 0),
    arrayOf(0, 0, 0, 0, 0, 1, 0, 0)
)

fun main() {
    // 3, 3
    // 7, 1
    // 2, 8
    do {
        imprimirMatriuColor(matriu)
        println("Aquesta és la matriu, escull les coordenades a les que vols pintar una regió.")
        val posX = comprovar("fila", 1, matriu.size)
        val posY = comprovar("columna", 1, matriu[0].size)
        pintarRegio(matriu, posX - 1, posY - 1)
        imprimirMatriuColor(matriu)
        println("Aquesta és la matriu resultant de intentar pintar una regió a la posició ($posX,$posY)\n")
        println("Vols continuar? S/N")
        val resposta = comprovarTipus("resposta","S","N")
        val continuar = resposta == "S"
    } while (continuar)
}