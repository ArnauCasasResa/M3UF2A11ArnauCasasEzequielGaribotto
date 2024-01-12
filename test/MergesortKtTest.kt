import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class MergesortKtTest {

    @Test
    fun paintRegion() {
        repeat(3) {
            val tamanyoRandom = (1..15).random()
            val lista = mutableListOf(tamanyoRandom)
            for (i in lista.indices){
                lista.add((-1000..1000).random())
            }
            val listaEsperadaPeruana=lista.sorted()
            val listaOrdenada = mergeSort(lista)
            assertArrayEquals(listaEsperadaPeruana.toIntArray(),listaOrdenada.toIntArray())
        }
    }
}