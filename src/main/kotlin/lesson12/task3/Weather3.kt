package lesson12.task3

class Weather3(dayTemperature: Int, nightTemperature: Int, isPrecipitationToday: Boolean) {

    val dayTemperature = dayTemperature
    val nightTemperature = nightTemperature
    val isPrecipitationToday = isPrecipitationToday

    fun printInformation() {
        println("Температура днем: ${dayTemperature - 273}")
        println("Температура ночью: ${nightTemperature - 273}")
        println("Осадки сегодня: $isPrecipitationToday")
    }

}