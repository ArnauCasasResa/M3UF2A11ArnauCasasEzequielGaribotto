import org.junit.jupiter.api.Assertions.*
import org.testng.annotations.Test
import org.testng.internal.junit.ArrayAsserts.assertArrayEquals

class MergesortKtTest {

    @Test
    fun paintRegion() {
        repeat(3) {
            val tamanyoRandom = (1..15).random()
            val listaperuana = mutableListOf(tamanyoRandom)
            for (i in listaperuana.indices){
                listaperuana.add((-1000..1000).random())
            }
            val listaEsperadaPeruana=listaperuana.sorted()
            val listaOrdenada = mergesort(listaperuana)
            assertArrayEquals(listaEsperadaPeruana.toIntArray(),listaOrdenada.toIntArray())
        }
    }
}