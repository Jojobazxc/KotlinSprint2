package lesson6

fun main() {

    print("Введите колличество секунд: ")
    val timer = readln().toInt()
    var startTime = 0

    while(timer > startTime){
        Thread.sleep(1000)
        startTime++

    }
    println("Прошло $timer секунд")

}