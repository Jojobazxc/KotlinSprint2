package lesson6

import kotlin.random.Random

fun main() {

    val randomNumber = Random.nextInt(1, 9)
    var userNumber: Int

    println("Попробуй угадать число от 1 до 9")
    while (COUNTER_OF_TRIES > 0) {
        userNumber = readln().toInt()
        if (userNumber == randomNumber) {
            println("Это была великолепная игра!")
            return
        } else println("Неверно, осталось попыток: ${--COUNTER_OF_TRIES}")
    }

    println("Было загадано число $randomNumber")

}

var COUNTER_OF_TRIES = 5