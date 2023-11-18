package lesson5

fun main() {

    print("6 * 8 = ")

    val mathExample: Boolean = ((6 * 8) == readln().toInt())

    if (mathExample) println("Добро пожаловать!")
    else println("Доступ запрещен.")

}