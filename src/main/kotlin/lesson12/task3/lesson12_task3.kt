package lesson12.task3

fun main() {

    val day = Weather3(303, 291, true)
    day.printInformation()

}

class Weather3(
    dayTemperature: Int,
    nightTemperature: Int,
    isPrecipitationToday: Boolean
) {
    private val dayTemperature = dayTemperature - 273
    private val nightTemperature = nightTemperature - 273
    private val isPrecipitationToday = isPrecipitationToday

    fun printInformation() {
        println("Температура днем: $dayTemperature")
        println("Температура ночью: $nightTemperature")
        println("Осадки сегодня: $isPrecipitationToday")
    }

}