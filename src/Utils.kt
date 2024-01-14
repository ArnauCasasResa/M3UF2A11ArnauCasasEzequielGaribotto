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
/**
 * @author Ezequiel Garibotto
 * @since 12/JAN/2024
 *
 * Procediment que imprimeix una matriu
 *
 * @param matriu matriu que es vol imprimir
 *
 */
fun imprimirMatriuColor(matriu:Array<Array<Int>>){
    // No cal fer tests, ja que no modifica cap valor, només imprimeix la matriu.
    for (fila in matriu.indices) {
        for (valor in matriu[fila].indices) {
            when (matriu[fila][valor]) {
                0 -> print("\u001B[47m \u001B[0m") // fondo blanco
                1 -> print("\u001B[40m \u001B[0m") // fondo negro
                2 -> print("\u001B[100m \u001B[0m") // fondo gris
            }
        }
        println()
    }
}

/**
 * Funció tail recursive de fibonacci
 *
 * @param n número del qual es vol conèixer el seu fibonacci
 *
 * @return fibonacci d'n
 *
 * Funció treta dels apunts de classe, la utilitzem per fer testos.
 */
fun fibonacci(n:Int): Long {
    tailrec fun fibonacci(n: Int, actual: Long, seguent: Long): Long {
        if (n == 0) return actual
        return fibonacci(n - 1, seguent, actual + seguent)
    }
    return fibonacci(n, 0L, 1L)
}