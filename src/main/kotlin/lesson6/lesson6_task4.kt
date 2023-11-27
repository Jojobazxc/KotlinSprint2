package lesson6

import kotlin.math.abs
import kotlin.random.Random

fun main() {

    val randomNumber = Random.nextInt(1, 9)
    var userNumber: Int
    var counterInStart: Int = 0

    println("Попробуй угадать число от 1 до 9")
    while (counterInStart < COUNTER_OF_TRIES) {
        userNumber = readln().toInt()
        counterInStart++
        if (userNumber == randomNumber) {
            println("Это была великолепная игра!")
            return
        } else println("Неверно, осталось попыток: ${abs(counterInStart - COUNTER_OF_TRIES)} ")
    }

    println("Было загадано число $randomNumber")

}

const val COUNTER_OF_TRIES = 5