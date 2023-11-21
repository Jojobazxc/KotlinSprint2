package lesson5

import kotlin.random.Random

fun main() {

    val firstNumber = Random.nextInt(1,50)
    val secondNumber = Random.nextInt(1,50)

    print("Для получение доступа решите пример: $firstNumber + $secondNumber = ")

    val mathExample: Boolean = ((firstNumber + secondNumber) == readln().toInt())

    if (mathExample) println("Добро пожаловать!")
    else println("Доступ запрещен.")

}