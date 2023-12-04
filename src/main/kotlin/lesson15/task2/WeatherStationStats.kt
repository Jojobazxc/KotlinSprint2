package lesson15.task2

abstract class WeatherStationStats() {
    abstract val value: Int
}

class Temperature(
    override val value: Int
) : WeatherStationStats() {
}

class PrecipitationAmount(
    override val value: Int
) : WeatherStationStats() {
}

class WeatherServer {
    fun sendDataToServer(data: WeatherStationStats){
        when(data){
            is Temperature -> {
                println("Сервер: температура - ${data.value}")
            }
            is PrecipitationAmount ->{
                println("Сервер: кол-во осадков - ${data.value}")
            }
            else -> println("Неверный тип данных")
        }
    }
}