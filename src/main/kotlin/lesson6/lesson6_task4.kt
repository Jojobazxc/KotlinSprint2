package lesson6

import kotlin.random.Random

fun main() {

    val randomNumber = Random.nextInt(1, 9)
    var counterOfTries = 5
    var userNumber: Int

    println("Попробуй угадать число от 1 до 9")
    while (counterOfTries > 0) {
        userNumber = readln().toInt()
        if (userNumber == randomNumber) {
            println("Это была великолепная игра!")
            return
        } else println("Неверно, осталось попыток: ${--counterOfTries}")
    }

    println("Было загадано число $randomNumber")

}