
/**
 * @author Arnau Casas
 * @since 12/GEN/2024
 *
 * Aquesta funció rep una llista mutable d'enters i la divideix en dues parts. Després,
 * crida la funció "merge" recursivament amb les dues meitats de la llista.
 *
 * @param llista Llista mutable d'enters que es vol ordenar.
 *
 * @see merge
 *
 * @return La llista ordenada.
 */
fun mergeSort(llista: MutableList<Int>){
    if (llista.size <= 1) return
    val meitat = llista.size / 2
    val meitatEsquerra = llista.subList(0, meitat).toMutableList()
    val meitatDreta = llista.subList(meitat, llista.size).toMutableList()
    mergeSort(meitatEsquerra)
    mergeSort(meitatDreta)
    merge(meitatEsquerra, meitatDreta, llista)
}

/**
 * @author Arnau Casas
 * @since 12/GEN/2024
 *
 * Aquesta funció rep dues meitats i les fusiona
 *
 *
 * @param meitatEsquerra Meitat esquerra de la llista mutable d'enters.
 * @param meitatDreta Meitat dreta de la llista mutable d'enters.
 *
 * @return La llista ordenada que conté els elements de les dues meitats.
 */
fun merge(meitatEsquerra: MutableList<Int>, meitatDreta: MutableList<Int>, llista: MutableList<Int>) {
    var iEsquerra = 0
    var iDreta = 0
    var tamany = 0

    while (iEsquerra < meitatEsquerra.size && iDreta < meitatDreta.size) {
        if (meitatEsquerra[iEsquerra] <= meitatDreta[iDreta]) {
            llista[tamany++] = meitatEsquerra[iEsquerra++]
        } else {
            llista[tamany++] = meitatDreta[iDreta++]
        }
    }

    while (iEsquerra < meitatEsquerra.size) {
        llista[tamany++] = meitatEsquerra[iEsquerra]
        iEsquerra++
    }

    while (iDreta < meitatDreta.size) {
        llista[tamany++] = meitatDreta[iDreta]
        iDreta++
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
    mergeSort(llista)
    println("Llista ordenada: $llista")
}

