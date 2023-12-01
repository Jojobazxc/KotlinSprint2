package lesson12.task2

class Weather2(val dayTemperature: Int, val nightTemperature: Int, val isPrecipitationToday: Boolean) {

    fun printInformation() {
        println("Температура днем: $dayTemperature")
        println("Температура ночью: $nightTemperature")
        println("Осадки сегодня: $isPrecipitationToday")
    }

}