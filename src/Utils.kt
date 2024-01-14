import java.math.BigInteger
import java.util.*

/**
 * @author Ezeqyiel Garibotto
 * @since 12/DEC/2023
 *
 * Aquesta funcio et demanarà que escullis un tipus d'IVA i comprovarà que si escrius qualsevol altra cosa que no
 * sigui el que et demana, si no poses l'opcio correcta et mostrarà que no és vàlid.
 *
 *
 * @param deQue string que s'utilitza en els prints per dir de per què et demana el tipus.
 * @param tipusValids array de strings, amb mida indefinida amb tots els tipus d'IVA que hi han
 *
 * @return dada de tipus String comprobada que estigui ben escrita
 */
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


/**
 * @author Ezequiel Garibotto
 * @since 24/DES/2023
 *
 * Aquesta funció llegeix un nombre enter
 *
 * @param nom nom de paràmetre a introduir
 * @param rangMin rang minim de l'integer introduït, per defecte será MIN_VALUE
 * @param rangMax rang màxim de l'integer introduït, per defecte será MIN_VALUE
 * @return nombre introduït per l'usuari
 */
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
 * Modificada amb BigInteger per poder fer testos amb laboratoriRatolins
 * @see laboratoriRatolins
 */
fun fibonacci(n:Int): BigInteger {
    tailrec fun fibonacci(n: Int, actual: BigInteger, seguent: BigInteger): BigInteger {
        if (n == 0) return actual
        return fibonacci(n - 1, seguent, actual + seguent)
    }
    return fibonacci(n, BigInteger.ZERO, BigInteger.ONE)
}