package lesson10

fun main() {

    var humanTrow: Int
    var roboticThrow: Int
    var agreementToPlay: Boolean
    var counter = 0


    do {
        humanTrow = getTry()
        roboticThrow = getTry()
        if (getProgressOfTheGame(humanTrow, roboticThrow)) counter++
        println("Хотите сыграть ещё? true/false ")
        agreementToPlay = readln().toBoolean()

    } while (agreementToPlay)
    println("Вы выиграли $counter раз!")

}

fun getTry(): Int = (0..6).random()


fun getProgressOfTheGame(humanThrow: Int, roboticThrow: Int): Boolean {
    val flag: Boolean
    if (humanThrow > roboticThrow) {
        println("Человечество победило!")
        flag = true
    } else if
                   (humanThrow == roboticThrow) {
        println("У человечества и роботов ничья!")
        flag = false
    } else {
        println("Роботы победили!")
        flag = false
    }
    println("Результат игры $humanThrow:$roboticThrow")
    return flag

}