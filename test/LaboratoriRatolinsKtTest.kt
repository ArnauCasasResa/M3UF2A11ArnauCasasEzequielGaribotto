import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class LaboratoriRatolinsKtTest {
    @Test
    // El ejercicio planteado se resuelve con el fibonacci con saltos de 12 (meses)
    fun laboratoriRatolins() {
        val testCases = 100
        val months = 12
        val fibStep12: MutableList<Long> = mutableListOf()
        for (num in 0..testCases * months step months) {
            fibStep12.add(fibonacci(num))
        }

        for (any in 0.. testCases) {
            assertEquals(fibStep12[any], laboratoriRatolins(any))
        }
    }
}