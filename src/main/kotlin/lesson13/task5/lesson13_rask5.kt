package lesson13.task5

fun main() {

    println("Введите номер телефона: ")
    val number = readln()

    try {
        val contact = Phonebook5("", number.toLong(), "")
    }catch (e:NumberFormatException){
        println("Ошибка: ${e::class.simpleName}")
    }
}