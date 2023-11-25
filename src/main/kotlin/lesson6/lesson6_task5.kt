package lesson6

import kotlin.random.Random

fun main() {

    print("Введите логин: ")
    val correctUserLogin: String = readln()
    print("Введите пароль: ")
    val correctUserPassword: String = readln()

    var userLoginSign: String
    var userPasswordSign: String
    var counterOfTries: Int
    var number1: Int
    var number2: Int
    var result: Int
    var userResult: Int

    do {

        println("Для авторизации введите данные еще раз")
        print("Логин: ")
        userLoginSign = readln()
        print("Пароль: ")
        userPasswordSign = readln()

        counterOfTries = 3

        while (counterOfTries > 0) {

            number1 = Random.nextInt(1, 10)
            number2 = Random.nextInt(1, 10)
            result = number1 + number2

            println("Для авторизации реши пример $number1 + $number2")
            userResult = readln().toInt()

            if (userResult == result) break
            else counterOfTries--

            if (counterOfTries == 0) {
                println("Доступ запрещен")
                return
            }
        }
    } while (correctUserLogin != userLoginSign || correctUserPassword != userPasswordSign)

    println("Добро пожаловать!")

}