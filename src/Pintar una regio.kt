import java.util.*

fun paintRegion(array: Array<Array<Int>>, x: Int, y: Int): Array<Array<Int>> {
    if (x < 0 || x >= array.size || y < 0 || y >= array[0].size || array[x][y] != 1) {
        return array
    }

    array[x][y] = 2

    paintRegion(array, x + 1, y)
    paintRegion(array, x - 1, y)
    paintRegion(array, x, y + 1)
    paintRegion(array, x, y - 1)

    return array
}

fun main() {
    val arrayInput = arrayOf(
        arrayOf(0, 1, 1, 1, 0, 1, 0, 0),
        arrayOf(0, 0, 1, 0, 0, 1, 0, 1),
        arrayOf(0, 1, 1, 1, 0, 1, 0, 1),
        arrayOf(0, 1, 1, 0, 0, 1, 0, 0),
        arrayOf(0, 0, 1, 1, 0, 1, 1, 1),
        arrayOf(0, 0, 0, 0, 0, 1, 0, 0),
        arrayOf(1, 1, 1, 1, 1, 1, 1, 0),
        arrayOf(0, 0, 0, 0, 0, 1, 0, 0)
    )

    val x = 3
    val y = 3

    val paintedArray = paintRegion(arrayInput, x-1, y-1)

    for (i in paintedArray.indices) {
        for (j in paintedArray[i].indices) {
            print("${paintedArray[i][j]} ")
        }
        println()
    }
}