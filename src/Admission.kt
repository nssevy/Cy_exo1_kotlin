fun adminOrNot(note: Int) {
    if (note >= 10) {
        println("Admis")
    } else {
        println("Recalé")
    }
}

fun main() {
    val note: Int  = 14;
    adminOrNot(note)
}