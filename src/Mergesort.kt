
/**
 * @author Arnau Casas
 * @since 12/GEN/2024
 *
 * Aquesta funcio a la cual li has introduit una llista de numeros, te la dividira entr dos.
 *
 * @param llista llista mutable amb enters
 *
 * @return  la llista ordenada
 */
fun mergeSort(llista: MutableList<Int>) : MutableList<Int> {
    val llistaOrdenada:MutableList<Int>
    val mitadLeft = llista.subList(0,llista.size/2)
    val mitadRight = llista.subList(llista.size/2, llista.size)
    if (llista.size <= 1) llistaOrdenada = llista
    else llistaOrdenada = ordenarLlista(mergeSort(mitadLeft), mergeSort(mitadRight))
    return llistaOrdenada
}
/**
 * @author Arnau Casas
 * @since 12/GEN/2024
 *
 * Aquesta funcio a la cual li has introduit una llista de numeros, te'ls ordenarà de més petit a més gran.
 *
 * @param izquierda llista mutable amb enters
 * @param derecha llista mutable amb enters
 *
 * @return  la llista ordenada
 */
fun ordenarLlista(izquierda: MutableList<Int>, derecha: MutableList<Int>):MutableList<Int> {
    val llistaCompleta= mutableListOf<Int>()
    val iteradores=addNumerosOrden(izquierda,derecha,llistaCompleta)
    llistaSola(iteradores.first,izquierda,llistaCompleta)
    llistaSola(iteradores.second,derecha,llistaCompleta)
    return llistaCompleta
}
/**
 * @author Arnau Casas
 * @since 12/GEN/2024
 *
 * Aquesta funcio afegirà el número més petit entre dues llistes.
 *
 * @param iterador nombre enter per iterar dins de la llista
 * @param llista llista mutable amb enters
 * @param llistaFinal llista mutable amb enters
 *
 * @return  la llista amb els numeros ordenats
 */
fun llistaSola(iterador:Int,llista:MutableList<Int>,llistaFinal:MutableList<Int>){
    var i =iterador
    while (i < llista.size) {
        llistaFinal.add(llista[i])
        i++
    }
}
/**
 * @author Arnau Casas
 * @since 12/GEN/2024
 *
 * Aquesta funcio iterarà entre dues llistes per afegir amb ordre dins d'un altre llista que sera la definitiva.
 *
 * @param izquierda llista mutable amb enters
 * @param derecha llista mutable amb enters
 * @param completa llista mutable amb enters
 *
 * @return un pair de la ultima posicio de cada una de les lista
 */
fun addNumerosOrden(izquierda: MutableList<Int>,
                    derecha: MutableList<Int>, completa:MutableList<Int>):Pair<Int,Int>{
    var iIzquierda=0
    var iDerecha=0
    while (iIzquierda < izquierda.size && iDerecha < derecha.size) {
        if (izquierda[iIzquierda] < derecha[iDerecha]) {
            completa.add(izquierda[iIzquierda])
            iIzquierda++
        }
        else {
            completa.add(derecha[iDerecha])
            iDerecha++
        }
    }
    return Pair(iIzquierda,iDerecha)
}

fun main() {
    val llista= mutableListOf<Int>()
    var numero = comprovar("numero")
    while (numero != -1){
        llista.add(numero)
        println("Insereix ${"-1"} per sortir.")
        numero = comprovar("numero")
    }
    println("Llista original: $llista")
    val llistaOrdenada:MutableList<Int> = mergeSort(llista)
    println("Llista ordenada: $llistaOrdenada")
}

