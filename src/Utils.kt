import java.util.*

fun comprovar(nom: String, rangMin: Int = Int.MIN_VALUE, rangMax: Int = Int.MAX_VALUE): Int {
    // No fa falta fer test, per funcions que interactuen amb l'usuari
    val scan = Scanner(System.`in`)
    var input = 0
    var valid = false
    while (!valid) {
        print("Insereix un enter [$nom]: ")
        if (scan.hasNextInt()) {
            input = scan.nextInt()
            if (input in rangMin..rangMax) {
                valid = true
            } else {
                println("Si us plau, insereix un enter [$nom] en el rang de $rangMin a $rangMax.")
            }
        } else {
            println("Si us plau, insereix un enter [$nom] valid.")
            scan.nextLine()
        }
    }
    return input
}
fun showMenu(titol: String, vararg opcions: String, lletres:Boolean = false, enrere:Boolean = true, halfWidth:Int = 16) {
    // No cal incloure un test, ja que aquesta funció no retorna res,
    // ni modifica els valors d'un array ni dels components d'una Data Class.
    var menu = "${"=".repeat(halfWidth)} $titol ${"=".repeat(halfWidth)}\n"
    for (seleccio in opcions.indices) {
        menu += if (lletres) "[ ${opcions[seleccio][0]} ] "
        else "[ ${seleccio + 1} ] "
        menu += "${opcions[seleccio]}\n"
    }
    if (enrere) {
        menu += if (lletres) "[ E ] "
        else "[ ${opcions.size + 1} ] "
        menu += "SORTIR\n"
    }
    menu += "=".repeat((halfWidth*2)+2 + titol.length)
    println(menu)
}
fun comprovarTipus(deQue: String, vararg tipusValids: String): String {
    // No fa falta fer test, per funcions que interactuen amb l'usuari
    val scan = Scanner(System.`in`)
    var tipus: String
    var valid = false
    do {
        print("Insereix un tipus $deQue: ")
        tipus = scan.next().uppercase(Locale.getDefault())
        if (tipus in tipusValids) valid = true
        else println("Insereix un tipus $deQue vàlid ${tipusValids.toList()}")
    } while (!valid)
    return tipus
}
fun printMatrix(array:Array<Array<Int>>){
    for (i in array.indices) {
        for (j in array[i].indices) {
            print("${array[i][j]} ")
        }
        println()
    }
}
fun partirLista(llista: MutableList<Int>) : MutableList<Int> {
    var llistaOrdenada= mutableListOf<Int>()
    val mitadLeft = llista.subList(0,llista.size/2)
    val mitadRight = llista.subList(llista.size/2, llista.size)
    if (llista.size <= 1) llistaOrdenada = llista
    else llistaOrdenada = ordenarLlista(partirLista(mitadLeft), partirLista(mitadRight))
    return llistaOrdenada
}

fun ordenarLlista(izquierda: MutableList<Int>, derecha: MutableList<Int>):MutableList<Int> {
    var llistaCompleta= mutableListOf<Int>()
    val iteradores=addNumerosOrden(izquierda,derecha,llistaCompleta)
    llistaSola(iteradores.first,izquierda,llistaCompleta)
    llistaSola(iteradores.second,derecha,llistaCompleta)
    return llistaCompleta
}

fun llistaSola(iterador:Int,llista:MutableList<Int>,llistaFinal:MutableList<Int>){
    var i =iterador
    while (i < llista.size) {
        llistaFinal.add(llista[i])
        i++
    }
}
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
