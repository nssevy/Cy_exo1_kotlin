package Conditions

fun whoTemperature(temperature: Int) {
    if (temperature < 0) {
        println("Gel")
    } else if (temperature < 15) {
        println("Froid")
    } else if (temperature < 25) {
        println("Doux")
    } else {
        println("Chaud")
    }
}

fun main() {
    val degre: Int = 14;
    whoTemperature(degre);
}
/*
La fonction prend en entre un Int et vient la tester avec chacune des branchs
 */