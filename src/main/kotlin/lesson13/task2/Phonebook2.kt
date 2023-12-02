package lesson13.task2

class Phonebook2(val name: String, val phoneNumber: Long, val company: String? = null) {
    fun printInfo() {
        println(
            "-Имя: $name \n-Номер телефона: $phoneNumber \n-Компания: ${company ?: "не указано"}"
        )

    }
}