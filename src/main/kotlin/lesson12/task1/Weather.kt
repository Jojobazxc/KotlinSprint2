package lesson12.task1

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