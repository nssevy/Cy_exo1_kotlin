package boucles

fun main(){

    val pays: String = "France";
    when (pays) {
        "Belgique" -> println("La capitale de la Belgique est Bruxel")
        "France" -> println("La capitale de la France est Paris")
        else -> println("Ville inconu")
    }

}

/*
When permet de tester un paterne à gauche et des lorsque le paterne est rencontrer il prends le contenu de ce qu'il y a à droite dans ce ca là affiche car il y a un print ln.
 */