val MaxCostatArray = 20
/**
 * @author Ezequiel Garibotto
 * @since 12/JAN/2024
 *
 * Aquesta funció pinta una regió d'una matriu donades la matriu i dues coordenades.
 * Es pinta una cella adjacent quan és a dalt, a sota, a l'esquerra o a la dreta
 * de la posició (x,y) de manera recursiva.
 *
 * @param matriu matriu que es vol pintar
 * @param x posició x a la que es vol pintar
 * @param y posició y a la que es vol pintar
 *
 * @return matriu amb la regió pintada
 */
fun paintRegion(matriu: Array<Array<Int>>, x: Int, y: Int): Array<Array<Int>> {
    if (x < 0 || x >= matriu.size || y < 0 || y >= matriu[0].size || matriu[x][y] != 1) {
        return matriu
    }

    matriu[x][y] = 2

    paintRegion(matriu, x + 1, y)
    paintRegion(matriu, x - 1, y)
    paintRegion(matriu, x, y + 1)
    paintRegion(matriu, x, y - 1)

    return matriu
}


fun main() {
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
    var x = comprovar("fila", -1, MaxCostatArray)
    var y = comprovar("columna", -1, MaxCostatArray)
    printMatrix(matriu)
    while (x !in -1..0 && y !in -1..0) {
        println("Aquesta és la matriu, escull les coordenades a les que vols pintar una regió.")
        val paintedMatrix = paintRegion(matriu, x - 1, y - 1)
        printMatrix(paintedMatrix)
        println("Aquesta és la matriu amb la regió pintada a la posició ($x,$y)\n")
        printMatrix(matriu)
        x = comprovar("fila", 1, MaxCostatArray)
        y = comprovar("columna", 1, MaxCostatArray)
    }
}