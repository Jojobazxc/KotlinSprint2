package lesson6

fun main() {

    print("Введите колличество секунд: ")
    var userSeconds = readln().toInt()

    while (userSeconds > 0) {
        println("Осталось секунд: ${userSeconds--}  ")
        Thread.sleep(1000)
    }

    println("Время вышло")

}