import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class PintarRegioKtTest {

    @Test
    fun pintarRegio1() {
        val arrayInput = arrayOf(
                        // v
            arrayOf(0, 1, 1, 1, 0, 1, 0, 0),
            arrayOf(0, 0, 1, 0, 0, 1, 0, 1),
            arrayOf(0, 1, 1, 1, 0, 1, 0, 1),
            arrayOf(0, 1, 1, 0, 0, 1, 0, 0),
            arrayOf(0, 0, 1, 1, 0, 1, 1, 1),
            arrayOf(0, 0, 0, 0, 0, 1, 0, 0),
            arrayOf(1, 1, 1, 1, 1, 1, 1, 0),
            arrayOf(0, 0, 0, 0, 0, 1, 0, 0)
        )

        val posX = 3
        val posY = 3

        pintarRegio(arrayInput,posX-1,posY-1)

        val expectedArray = arrayOf(
                        // v
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
    @Test
    fun pintarRegio2() {
        val arrayInput = arrayOf(
            arrayOf(0, 1, 1, 1, 0, 1, 0, 0),
            arrayOf(0, 0, 1, 0, 0, 1, 0, 1),
            arrayOf(0, 1, 1, 1, 0, 1, 0, 1),
            arrayOf(0, 1, 1, 0, 0, 1, 0, 0),
            arrayOf(0, 0, 1, 1, 0, 1, 1, 1), // <--
            arrayOf(0, 0, 0, 0, 0, 1, 0, 0),
            arrayOf(1, 1, 1, 1, 1, 1, 1, 0),
            arrayOf(0, 0, 0, 0, 0, 1, 0, 0)
        )

        val posX = 7
        val posY = 1

        pintarRegio(arrayInput,posX-1,posY-1)

        val expectedArray = arrayOf(
            arrayOf(0, 1, 1, 1, 0, 2, 0, 0),
            arrayOf(0, 0, 1, 0, 0, 2, 0, 1),
            arrayOf(0, 1, 1, 1, 0, 2, 0, 1),
            arrayOf(0, 1, 1, 0, 0, 2, 0, 0),
            arrayOf(0, 0, 1, 1, 0, 2, 2, 2), // <--
            arrayOf(0, 0, 0, 0, 0, 2, 0, 0),
            arrayOf(2, 2, 2, 2, 2, 2, 2, 0),
            arrayOf(0, 0, 0, 0, 0, 2, 0, 0))

        assertArrayEquals(expectedArray,arrayInput)
    }
    @Test
    fun pintarRegio3() {
        val arrayInput = arrayOf(
            arrayOf(0, 1, 1, 1, 0, 1, 0, 0),
            arrayOf(0, 0, 1, 0, 0, 1, 0, 1), // <--
            arrayOf(0, 1, 1, 1, 0, 1, 0, 1), // <--
            arrayOf(0, 1, 1, 0, 0, 1, 0, 0),
            arrayOf(0, 0, 1, 1, 0, 1, 1, 1),
            arrayOf(0, 0, 0, 0, 0, 1, 0, 0),
            arrayOf(1, 1, 1, 1, 1, 1, 1, 0),
            arrayOf(0, 0, 0, 0, 0, 1, 0, 0)
        )

        val posX = 2
        val posY = 8

        pintarRegio(arrayInput,posX-1,posY-1)

        val expectedArray = arrayOf(
            arrayOf(0, 1, 1, 1, 0, 1, 0, 0),
            arrayOf(0, 0, 1, 0, 0, 1, 0, 2), // <--
            arrayOf(0, 1, 1, 1, 0, 1, 0, 2), // <--
            arrayOf(0, 1, 1, 0, 0, 1, 0, 0),
            arrayOf(0, 0, 1, 1, 0, 1, 1, 1),
            arrayOf(0, 0, 0, 0, 0, 1, 0, 0),
            arrayOf(1, 1, 1, 1, 1, 1, 1, 0),
            arrayOf(0, 0, 0, 0, 0, 1, 0, 0)
        )

        assertArrayEquals(expectedArray,arrayInput)
    }
}