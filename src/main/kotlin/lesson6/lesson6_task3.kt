package lesson6

fun main() {

    print("Введите колличество секунд: ")
    var userSeconds = readln().toInt()

    val timer = userSeconds
    var startTime = 0

    while (timer != startTime) {
        startTime++
        println("Осталось секунд: ${userSeconds--}  ")
        Thread.sleep(1000)
    }

    println("Время вышло")
    println("Прошло $timer секунд")

}