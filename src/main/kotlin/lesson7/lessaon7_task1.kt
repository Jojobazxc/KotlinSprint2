package lesson7

import kotlin.random.Random

fun main() {

    var password = ""
    var char: String

    for (i in 0..<LENGHT_OF_PASSWORD) {
        if (i % 2 == 0) {
            char = ('a'..'z').random().toString()
            password += char
        } else {
            char = Random.nextInt(1, 10).toString()
            password += char
        }
    }

    println("Сгенерированный пароль: $password")

}

const val LENGHT_OF_PASSWORD = 6