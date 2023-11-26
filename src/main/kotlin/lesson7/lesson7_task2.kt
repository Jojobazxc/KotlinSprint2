package lesson7

import kotlin.random.Random

fun main() {

    var numberForSign: String
    var enterUserNumber: String

    do {

        numberForSign = Random.nextInt(1000, 10000).toString()
        println("Ваш код для авторизации: $numberForSign.")
        print("Введите полученный код для авторизации: ")
        enterUserNumber = readln()

    } while (enterUserNumber != numberForSign)

    println("Добро пожаловать!")

}