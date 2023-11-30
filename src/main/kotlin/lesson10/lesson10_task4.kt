package lesson10

fun main() {

    var humanTrow: Int?
    var roboticThrow: Int?
    var agreementToPlay: Boolean
    var counter = 0
    var flag = false

    do {
        humanTrow = getTry()
        roboticThrow = getTry()
        flag = getProgressOfTheGame(humanTrow, roboticThrow, flag)
        if (flag) counter++
        println("Хотите сыграть ещё? true/false ")
        agreementToPlay = readln().toBoolean()

    } while (agreementToPlay)
    println("Вы выиграли $counter раз!")

}

fun getTry(): Int? = (0..6).random()


fun getProgressOfTheGame(humanThrow: Int?, roboticThrow: Int?, flag: Boolean?): Boolean {
    var flag = false
    if (humanThrow!! > roboticThrow!!) {
        println(
            "Человечество победило!\n" +
                    "Результат игры $humanThrow:$roboticThrow"
        )
        flag = true
    } else if (humanThrow == roboticThrow) println(
        "У человечества и роботов ничья!\n" +
                "Результат игры $humanThrow:$roboticThrow"
    )
    else println(
        "Роботы победили!\n" +
                "Результат игры $humanThrow:$roboticThrow"
    )
    return flag
}