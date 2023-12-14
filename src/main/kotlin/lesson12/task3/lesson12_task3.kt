package lesson12.task3

fun main() {

    val day = Weather3(303, 291, true)
    day.printInformation()

}

class Weather3(
    private val dayTemperature: Int,
    private val nightTemperature: Int,
    private val isPrecipitationToday: Boolean
) {

    fun printInformation() {
        println("Температура днем: ${dayTemperature - 273}")
        println("Температура ночью: ${nightTemperature - 273}")
        println("Осадки сегодня: $isPrecipitationToday")
    }

}