package lesson12.task1

fun main() {

    val day = Weather()
    day.dayTemperature = 24
    day.nightTemperature = 15
    day.isPrecipitationToday = false

    val day2 = Weather()
    day2.dayTemperature = 28
    day2.nightTemperature = 18
    day2.isPrecipitationToday = true

    day.printInformation()
    println()
    day2.printInformation()

}

class Weather {

    var dayTemperature = 0
    var nightTemperature = 0
    var isPrecipitationToday: Boolean = true

    fun printInformation() {
        println("Температура днем: $dayTemperature")
        println("Температура ночью: $nightTemperature")
        println("Осадки сегодня: $isPrecipitationToday")
    }

}