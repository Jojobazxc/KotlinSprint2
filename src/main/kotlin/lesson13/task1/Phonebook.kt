package lesson13.task1

class Phonebook(val name: String, val phoneNumber: Long, val company: String?) {
    fun printInfo() {
        println("Имя: $name")
        println("Номер телефона: $phoneNumber")
        println("Компания: $company")
    }
}