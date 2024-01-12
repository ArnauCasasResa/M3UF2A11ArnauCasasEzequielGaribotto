import java.util.*
fun main() {
    val llista= mutableListOf<Int>()
    llista.add(comprovar("numero"))
    var insert:Int = 0
    while (insert != -1){
        insert = comprovar("numero")
        llista.add(insert)
        println("Insereix -1 per parar")
    }
    llista.removeAt(llista.lastIndex)
    println("Llista original:$llista")
    val llistaOrdre:MutableList<Int> = partirLista(llista)
    println("Llista ordenada:$llistaOrdre")
}
