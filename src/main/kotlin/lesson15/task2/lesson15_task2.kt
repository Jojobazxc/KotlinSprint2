package lesson15.task2

fun main() {

    val temperature = Temperature(25)
    val precipitationAmount = PrecipitationAmount(500)

    val weatherServer = WeatherServer()

    weatherServer.sendDataToServer(temperature)
    weatherServer.sendDataToServer(precipitationAmount)

}