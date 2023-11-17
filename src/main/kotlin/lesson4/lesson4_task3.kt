package lesson4

fun main() {

    val weatherIsSunny: Boolean = true
    val tentIsOpen: Boolean = true
    val humidity = 20
    val season = "зима"

    println("Благоприятные ли условия для роста бобовых? ${weatherIsSunny && tentIsOpen && (humidity == 20) && (season != "зима")}")

}