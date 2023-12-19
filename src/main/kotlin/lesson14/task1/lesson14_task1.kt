package lesson14.task1

fun main() {

    val liner1 = Liner("Лайнер", 40, 10000)
    liner1.printInformationOfShip()
    println()

    val icebreaker1 = Icebreaker("Ледокол", 15, 500, true)
    icebreaker1.printInformationOfShip()
    println()

    val cargoShip = CargoShip("Грузовой корабль", 20, 100, 100000)
    cargoShip.printInformationOfShip()

}

open class Liner(
    private val name: String,
    private val speed: Int,
    private val сapacity: Int,
) {
    open fun printInformationOfShip() {
        println("Название: $name")
        println("Cкорость: $speed")
        println("Вместительность: $сapacity")
    }
}

class Icebreaker(
    name: String,
    speed: Int,
    capacity: Int,
    private val breakIce: Boolean
) : Liner(name, speed, capacity) {
    override fun printInformationOfShip() {
        super.printInformationOfShip()
        println("Способность колоть лед: $breakIce")
    }
}

class CargoShip(
    name: String,
    speed: Int,
    capacity: Int,
    private val liftingCapacity: Int,
) : Liner(name, speed, capacity) {
    override fun printInformationOfShip() {
        super.printInformationOfShip()
        println("Грузоподъемность: $liftingCapacity")
    }
}