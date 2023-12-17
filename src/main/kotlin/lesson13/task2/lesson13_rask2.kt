package lesson13.task2

fun main() {
    val contact1 = Phonebook2("Александр", 88005553535, null)
    contact1.printInfo()
}

class Phonebook2(private val name: String, private val phoneNumber: Long, private val company: String? = null) {
    fun printInfo() {
        println(
            "-Имя: $name \n-Номер телефона: $phoneNumber \n-Компания: ${company ?: "не указано"}"
        )

    }
}