
/**
 * @author Arnau Casas
 * @since 12/GEN/2024
 *
 * Aquesta funció rep una llista mutable d'enters i la divideix en dues parts. Després,
 * crida la funció "ordenarLlista" recursivament amb les dues meitats de la llista.
 *
 * @param llista Llista mutable d'enters que es vol ordenar.
 *
 * @see ordenarLlista
 *
 * @return La llista ordenada.
 */
fun mergeSort(llista: MutableList<Int>): MutableList<Int> {
    val llistaOrdenada: MutableList<Int>
    val meitatEsquerra = llista.subList(0, llista.size / 2)
    val meitatDreta = llista.subList(llista.size / 2, llista.size)

    if (llista.size <= 1) {
        llistaOrdenada = llista
    } else {
        llistaOrdenada = ordenarLlista(mergeSort(meitatEsquerra), mergeSort(meitatDreta))
    }

    return llistaOrdenada
}

/**
 * @author Arnau Casas
 * @since 12/GEN/2024
 *
 * Aquesta funció rep dues meitats de la llista i crida altres funcions per ordenar-les i combinar-les.
 *
 * @see addNumerosOrden
 * @see llistaSola
 *
 * @param meitatEsquerra Meitat esquerra de la llista mutable d'enters.
 * @param meitatDreta Meitat dreta de la llista mutable d'enters.
 *
 * @return La llista ordenada que conté els elements de les dues meitats.
 */
fun ordenarLlista(meitatEsquerra: MutableList<Int>, meitatDreta: MutableList<Int>): MutableList<Int> {
    val llistaCompleta = mutableListOf<Int>()
    val iteradores = addNumerosOrden(meitatEsquerra, meitatDreta, llistaCompleta)
    llistaSola(iteradores.first, meitatEsquerra, llistaCompleta)
    llistaSola(iteradores.second, meitatDreta, llistaCompleta)
    return llistaCompleta
}

/**
 * @author Arnau Casas
 * @since 12/GEN/2024
 *
 * Aquesta funció itera entre dues llistes per afegir els elements de manera ordenada a una altra llista.
 *
 * @param meitatEsquerra Meitat esquerra de la llista mutable d'enters.
 * @param meitatDreta Meitat dreta de la llista mutable d'enters.
 * @param llistaCompleta Llista mutable d'enters que contendrà els elements ordenats.
 *
 * @return Una parella amb la última posició de cada una de les llistes.
 */
fun addNumerosOrden(meitatEsquerra: MutableList<Int>, meitatDreta: MutableList<Int>, llistaCompleta: MutableList<Int>): Pair<Int, Int> {
    var iEsquerra = 0
    var iDreta = 0

    while (iEsquerra < meitatEsquerra.size && iDreta < meitatDreta.size) {
        if (meitatEsquerra[iEsquerra] < meitatDreta[iDreta]) {
            llistaCompleta.add(meitatEsquerra[iEsquerra])
            iEsquerra++
        } else {
            llistaCompleta.add(meitatDreta[iDreta])
            iDreta++
        }
    }
    return Pair(iEsquerra, iDreta)
}

/**
 * @author Arnau Casas
 * @since 12/GEN/2024
 *
 * Aquesta funció afegeix el nombre més petit entre dues llistes a una llista final.
 *
 * @param iterador Nombre enter per iterar dins de la llista.
 * @param meitat Llista mutable d'enters.
 * @param llistaFinal Llista mutable d'enters que contendrà els elements ordenats.
 */
fun llistaSola(iterador: Int, meitat: MutableList<Int>, llistaFinal: MutableList<Int>) {
    var i = iterador
    while (i < meitat.size) {
        llistaFinal.add(meitat[i])
        i++
    }
}

fun main() {
    val llista= mutableListOf<Int>()
    var numero = comprovar("numero")
    while (numero != -1){
        llista.add(numero)
        println("Insereix -1 per sortir.")
        numero = comprovar("numero")
    }
    println("Llista original: $llista")
    val llistaOrdenada:MutableList<Int> = mergeSort(llista)
    println("Llista ordenada: $llistaOrdenada")
}

