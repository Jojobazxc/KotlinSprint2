package lesson5

import java.util.Calendar

fun main() {

    val currentYear = Calendar.getInstance().get(Calendar.YEAR)

    print("Введите год своего рождения: ")
    val yearOfBirth = readln().toInt()

    val userAge = currentYear - yearOfBirth

    if(userAge >= AGE_OF_MAJORITY) println("Показать экран со скрытым контентом")
    else println("Вернуться на главный экран")

}

const val AGE_OF_MAJORITY = 18
