package lesson6

import kotlin.random.Random

fun main() {

    print("Введите логин: ")
    val correctUserLogin: String = readln()
    print("Введите пароль: ")
    val correctUserPassword: String = readln()

    var counterInStart = 0
    var number1: Int
    var number2: Int
    var result: Int
    var userResult: Int

    while (counterInStart <= COUNTER_OF_TRIES) {

        number1 = Random.nextInt(1, 10)
        number2 = Random.nextInt(1, 10)
        result = number1 + number2

        println("Для авторизации реши пример $number1 + $number2")
        userResult = readln().toInt()

        if (userResult == result) break
        else counterInStart++

        if (counterInStart == COUNTER_OF_TRIES) {
            println("Доступ запрещен")
            return
        }
    }
    println("Добро пожаловать!")
}

const val COUNTER_OF_TRIES = 3