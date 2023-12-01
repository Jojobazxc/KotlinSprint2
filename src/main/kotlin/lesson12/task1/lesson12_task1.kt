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