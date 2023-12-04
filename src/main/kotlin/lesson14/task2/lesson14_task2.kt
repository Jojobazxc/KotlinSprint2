package lesson14.task2

fun main() {

    val liner1 = Liner2()
    liner1.printInformationOfShip()
    liner1.ladderExtension()
    println()

    val icebreaker1 = Icebreaker2()
    icebreaker1.printInformationOfShip()
    icebreaker1.openingTheGate()
    println()

    val cargoShip = CargoShip2()
    cargoShip.printInformationOfShip()
    cargoShip.activationOfLoadingCrane()

}