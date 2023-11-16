package lesson3

fun main() {

    val steps = "D2-D4;0"

    val startStep = steps.substring(0, 2)
    val finishStep = steps.substring(3, 5)
    val numberOfStep = steps.substring(6, 7)

    println("Начальная позиция: $startStep")
    println("Конечная позиция: $finishStep")
    println("Номер хода: $numberOfStep")

}