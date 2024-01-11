import java.util.*
val MaxCostatArray = 20
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

    val x = comprovar("fila",1,MaxCostatArray)
    val y = comprovar("columna",1,MaxCostatArray)

    val paintedMatrix = paintRegion(matriu, x-1, y-1)

    printMatrix(paintedMatrix)
}