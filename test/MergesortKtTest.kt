import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class MergesortKtTest {

    @Test
    fun paintRegion() {
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

        paintRegion(arrayInput,x-1,y-1)

        val expectedArray = arrayOf(
            arrayOf(0, 2, 2, 2, 0, 1, 0, 0),
            arrayOf(0, 0, 2, 0, 0, 1, 0, 1),
            arrayOf(0, 2, 2, 2, 0, 1, 0, 1),
            arrayOf(0, 2, 2, 0, 0, 1, 0, 0),
            arrayOf(0, 0, 2, 2, 0, 1, 1, 1),
            arrayOf(0, 0, 0, 0, 0, 1, 0, 0),
            arrayOf(1, 1, 1, 1, 1, 1, 1, 0),
            arrayOf(0, 0, 0, 0, 0, 1, 0, 0))

        assertArrayEquals(expectedArray,arrayInput)
    }
}