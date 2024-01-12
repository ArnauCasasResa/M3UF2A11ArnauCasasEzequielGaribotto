import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Laboratori_ratolinsKtTest {
    val testCases = 100
    val months = 12
    @Test
    fun laboratoriRatolins() {
        val fibStep12: MutableList<Long> = mutableListOf()
        for (num in 0..testCases * months step months) {
            fibStep12.add(fibonacci(num))
        }

        for (any in 0.. testCases) {
            assertEquals(fibStep12[any], laboratoriRatolins(any))
        }
    }
}