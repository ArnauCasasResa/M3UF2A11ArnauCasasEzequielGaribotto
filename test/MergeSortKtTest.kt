import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class MergeSortKtTest {

    @Test
    fun mergeSortTest() {
        // Por cada tamaño creamos una lista de su tamaño con numeros aleatorios de -1000 a 1000
        // y luego la ordenamos con la funcion predeterminada de kotlin y comparamos con nuetra
        // función mergeSort
        for (tamanyo in (1..1000)) {
            repeat(tamanyo) {
                val lista = mutableListOf(tamanyo)
                for (i in lista.indices) {
                    lista.add((-1000..1000).random())
                }
                val listaEsperada = lista.sorted()
                mergeSort(lista)
                assertArrayEquals(listaEsperada.toIntArray(), lista.toIntArray())
            }
        }
    }
}