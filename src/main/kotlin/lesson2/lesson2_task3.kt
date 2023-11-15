package lesson2

fun main(){

    val hoursOfStart: Short = 9
    val minutesOfStart: Short = 39
    val minutesOfPath: Short = 457

    val hoursOfArrival: Int = ((hoursOfStart * 60) + minutesOfStart + minutesOfPath) / 60
    val minutesOfArrival: Int = ((hoursOfStart * 60) + minutesOfStart + minutesOfPath) % 60

    println("Время прибытия поезда: $hoursOfArrival:$minutesOfArrival")

}