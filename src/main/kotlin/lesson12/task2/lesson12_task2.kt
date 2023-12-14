package lesson12.task2

fun main() {

    val day = Weather2(12, 3, true)
    day.printInformation()

}

class Weather2(
    private val dayTemperature: Int,
    private val nightTemperature: Int,
    private val isPrecipitationToday: Boolean
) {

    fun printInformation() {
        println("Температура днем: $dayTemperature")
        println("Температура ночью: $nightTemperature")
        println("Осадки сегодня: $isPrecipitationToday")
    }

}