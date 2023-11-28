package lesson6

fun main() {

    print("Введите колличество секунд: ")
    val timer = readln().toLong()

    Thread.sleep((timer * 1000))

    println("Прошло $timer секунд")

}