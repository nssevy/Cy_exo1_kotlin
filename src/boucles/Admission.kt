package boucles

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
/*
La fonction prend en entrer un Int et vient comparer dans les deux branches l'entier avec une condition qui vérifie si elle est au dessus ou egale à 10 dans le cas contraire il tombe dans le else.
 */