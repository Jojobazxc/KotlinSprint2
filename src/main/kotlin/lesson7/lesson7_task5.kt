package lesson7

import kotlin.random.Random

fun main() {

    var password = ""
    print("Задайте длину пароля не менее 6 символов: ")
    val userLengthOfPassword = readln().toInt()

    var case: Int
    var randomChar: String

    for (i in 0..userLengthOfPassword) {
        case = Random.nextInt(0, 3)

        when (case) {
            0 -> {
                randomChar = ('A'..'Z').random().toString()
                password += randomChar
            }

            1 -> {
                randomChar = ('a'..'z').random().toString()
                password += randomChar
            }

            2 -> {
                randomChar = Random.nextInt(1, 10).toString()
                password += randomChar
            }
        }
    }
    println("Сгенерированный пароль: $password")
}
