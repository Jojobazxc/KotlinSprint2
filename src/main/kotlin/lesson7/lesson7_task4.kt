package lesson7

fun main() {

    print("Введите кол-во секунд: ")
    val userNumber = readln().toInt()

    for (i in userNumber downTo 1) {
        println("Остолось секунд: $i")
        Thread.sleep(1000)
    }

    println("Время вышло")

}