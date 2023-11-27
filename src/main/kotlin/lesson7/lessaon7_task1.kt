package lesson7

import kotlin.random.Random
import kotlin.random.nextInt

fun main() {

    var password = ""
    var char: String
    val rangeOfSymbols = 'a'..'z'
    val rangeOfNumbers = 1..9

    for (i in 0..<LENGHT_OF_PASSWORD) {
        if (i % 2 == 0) {
            char = (rangeOfSymbols).random().toString()
            password += char
        } else {
            char = Random.nextInt(rangeOfNumbers).toString()
            password += char
        }
    }

    println("Сгенерированный пароль: $password")

}

const val LENGHT_OF_PASSWORD = 6