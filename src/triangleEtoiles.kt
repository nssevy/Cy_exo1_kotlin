fun printTriangle(hauteur: Int) {
    if (hauteur > 0) {
        printTriangle(hauteur - 1)
        println("*".repeat(hauteur))
    }
}

fun main() {
    val lettre: Char = '*';
    printTriangle(5)
}