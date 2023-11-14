package lesson1

fun main(){

    var seconds: Int = 6480
    var hours: Int
    var minutes: Int

    minutes = seconds / 60
    val secondsRemains = seconds % 60
    hours = minutes / 60
    val minutesRemains = minutes % 60

    val formattedHours = String.format("%02d", hours)
    val formattedMinutes = String.format("%02d", minutesRemains)
    val formattedSeconds = String.format("%02d", secondsRemains)

    println("Время, проведенное в космосе: $formattedHours:$formattedMinutes:$formattedSeconds")

}