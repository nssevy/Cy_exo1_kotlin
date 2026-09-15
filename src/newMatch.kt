enum class FeuRouge {
    ROUGE,
    ORANGE,
    VERT
}

fun nextFeu(feu: FeuRouge): FeuRouge = when(feu) {
        FeuRouge.VERT -> FeuRouge.ORANGE
        FeuRouge.ORANGE -> FeuRouge.ROUGE
        FeuRouge.ROUGE -> FeuRouge.VERT
}

fun printNextFeu(feu: FeuRouge) {
    when (feu) {
        FeuRouge.ROUGE -> println("Le feu est rouge")
        FeuRouge.ORANGE -> println("Le feu est orange")
        FeuRouge.VERT -> println("Le feu est vert")
    }
}

fun main() {
    var feu = FeuRouge.ROUGE;
    var i: Int = 4;

    while(i != 0){
        var temps: Int = 5;
        feu = nextFeu(feu);
        while (temps != 0) {
            println("Attends : $temps");
            temps -= 1;
        }
        printNextFeu(feu);
        i -= 1;
    }
}