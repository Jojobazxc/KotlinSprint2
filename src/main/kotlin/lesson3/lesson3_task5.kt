package lesson3

fun main() {

    val steps = "D2-D4;0"

    val stepsSplit = steps.split(";", "-")
    val startStep = stepsSplit[0]
    val finishStep = stepsSplit[1]
    val numberOfStep = stepsSplit[2]

    println("Начальная позиция: $startStep")
    println("Конечная позиция: $finishStep")
    println("Номер хода: $numberOfStep")

}