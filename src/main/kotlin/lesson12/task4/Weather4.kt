package lesson12.task4

class Weather4(dayTemperature: Int, nightTemperature: Int, isPrecipitationToday: Boolean) {

    init {
        println("Температура днем: ${dayTemperature - 273}")
        println("Температура ночью: ${nightTemperature - 273}")
        println("Осадки сегодня: $isPrecipitationToday")
    }

}