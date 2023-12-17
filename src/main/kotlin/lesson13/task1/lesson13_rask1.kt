package lesson13.task1

fun main() {
    val contact1 = Phonebook("Александр", 88005553535, null)
    contact1.printInfo()
}

class Phonebook(private val name: String, private val phoneNumber: Long, private val company: String?) {
    fun printInfo() {
        println("Имя: $name")
        println("Номер телефона: $phoneNumber")
        println("Компания: $company")
    }
}