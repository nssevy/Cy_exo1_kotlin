package boucles

fun tableMultiplicationOf(value: Int){
    var i: Int = 1;
    while (i <= 10) {
        println("$value * $i = ${value * i}")
        i+= 1;
    }
}

fun main() {
    var chiffre: Int = 5;
    tableMultiplicationOf(chiffre)
}

/*
    la fonction prend en entrer un Int, ensuite on initialise i qui va servire et de multiplicateur et de condition pour la boucle while que l'on va venir incrementer dans la fonction mais avant ca on vient afficher la valeur entre et le résultat de la multiplication.
 */