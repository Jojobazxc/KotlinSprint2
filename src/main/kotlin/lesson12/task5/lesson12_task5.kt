package lesson12.task5

fun main() {

    val listOfData: MutableList<Weather5> = mutableListOf()
    var objectOfClass: Weather5
    var dayTemperature: Int
    var nightTemperature: Int
    var isPrecipitationToday: Boolean

    for (i in 1..30) {
        dayTemperature = (15..30).random()
        nightTemperature =
            ((dayTemperature - 5)..<dayTemperature).random() // не знал, как сделать так, чтобы температура ночью была меньше дневной
        isPrecipitationToday = Boolean.random()
        objectOfClass = Weather5(dayTemperature, nightTemperature, isPrecipitationToday)
        listOfData.add(objectOfClass)
    }

    val listOfDayTemperature = mutableListOf<Int>()
    listOfData.forEach { listOfDayTemperature.add(it.dayTemperature) }

    val listOfNightTemperature = mutableListOf<Int>()
    listOfData.forEach { listOfNightTemperature.add(it.nightTemperature) }

    val listOfDaysWithPrecipitation = mutableListOf<Boolean>()
    listOfData.forEach { if (it.isPrecipitationToday) listOfDaysWithPrecipitation.add(it.isPrecipitationToday) }

    val averageOfDay = listOfDayTemperature.average()
    val averageOfNight = listOfNightTemperature.average()
    val countOfDayWithPrecipitation = listOfDaysWithPrecipitation.count()

    println("Средняя температура днем: %.1f".format(averageOfDay))
    println("Средняя температура ночью: %.1f".format(averageOfNight))
    println("Кол-во дней с осадками: $countOfDayWithPrecipitation")

}

class Weather5(val dayTemperature: Int, val nightTemperature: Int, var isPrecipitationToday: Boolean)

private fun Boolean.Companion.random(): Boolean {
    return listOf(true, false).random()
}

//для примера тут взял летние дни