package lesson10

fun main() {

    val moveOfHuman = getResultsOfGame()
    val moveOfMachine = getResultsOfGame()

    println("Бросает человек. Выпало: $moveOfHuman")
    Thread.sleep(1000)

    println("Бросает компьютер. Выпало: $moveOfMachine")
    Thread.sleep(1000)

    if (moveOfHuman > moveOfMachine) println("Победило человечество!")
    else if(moveOfHuman == moveOfMachine) println("Победила дружба!")
    else println("Победила машина!")

}

fun getResultsOfGame(): Int {
    return (1..6).random()
}