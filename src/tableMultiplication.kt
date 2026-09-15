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