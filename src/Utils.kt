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

fun printMatrix(array:Array<Array<Int>>){
    for (i in array.indices) {
        for (j in array[i].indices) {
            print("${array[i][j]} ")
        }
        println()
    }
}


fun fibonacci(n:Int): Long {
    tailrec fun fibonacci(n: Int, actual: Long, seguent: Long): Long {
        if (n == 0) return actual
        return fibonacci(n - 1, seguent, actual + seguent)
    }
    return fibonacci(n, 0L, 1L)
}