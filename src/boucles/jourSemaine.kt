package boucles

fun whoJour(jour: Int){
    when(jour) {
        1 -> println("Lundi")
        2 -> println("Mardi")
        3 -> println("Mercredi")
        4 -> println("Jeudi")
        5 -> println("Vendredi")
        in 6..7 -> println("Week-end")
        else ->  println("Jour inexistant.")
    }
}

fun main() {
    val jourEnChiffre: Int = 2;
    whoJour(jourEnChiffre);
}
/*
Là la fonction prend en entrer un Int et bient test en casquade cet entier avec toutes les branches du when jusqua tomber sur la bonne valeur, la fn affiche Mardi
 */