package lesson4

fun main() {

    val isSunny: Boolean = true
    val isAwningOpen: Boolean = true
    val humidity = 20
    val season = "зима"

    val condition = ((isSunny == IS_SUNNY) && (isAwningOpen == IS_AWNING_OPEN)
            && (humidity == HUMIDITY) && (season == SEASON))

    println("Благоприятные ли условия для роста бобовых? ${condition}")

}

const val HUMIDITY = 20
const val IS_SUNNY: Boolean = true
const val IS_AWNING_OPEN: Boolean = true
const val SEASON = "не зима"