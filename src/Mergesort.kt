import java.util.*
fun main() {
    val scan=Scanner(System.`in`)
    var llista= mutableListOf<Int>()
    var llistaOrdre=mutableListOf<Int>()
    var introduirNumero=true
    while (introduirNumero){
        llista.add(comprovar("numero"))
        println("Vols seguir introduint numeros?")
        if (comprovarTipus("opcio","SI","NO")=="NO"){
            introduirNumero=false
        }
    }
    println("Llista original:$llista")
    llistaOrdre= ordenarLista(llista)
    println("Llista ordenada:$llistaOrdre")
}
