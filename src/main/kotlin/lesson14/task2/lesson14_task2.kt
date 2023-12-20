package lesson14.task2

fun main() {

    val liner1 = Liner2()
    liner1.printInformationOfShip()
    liner1.load()
    println()

    val icebreaker1 = Icebreaker2()
    icebreaker1.printInformationOfShip()
    icebreaker1.load()
    println()

    val cargoShip = CargoShip2()
    cargoShip.printInformationOfShip()
    cargoShip.load()

}

open class Liner2(
    val name: String = "Лайнер",
    private val speed: Int = 40,
    private val сapacity: Int = 10000,
) {
    open fun printInformationOfShip() {
        println("Название: $name")
        println("Cкорость: $speed")
        println("Вместительность: $сapacity")
    }

    open fun load() {
        println("$name: выдвигает горизонтальный трап со шкафута")
    }
}

class Icebreaker2(
    name: String = "Ледокол",
    speed: Int = 15,
    capacity: Int = 500,
    private val breakIce: Boolean = true
) : Liner2(name, speed, capacity) {
    override fun printInformationOfShip() {
        super.printInformationOfShip()
        println("Способность колоть лед: $breakIce")
    }

    override fun load() {
        println("$name: открывает ворота со стороны кормы")
    }
}

class CargoShip2(
    name: String = "Грузовой корабль",
    speed: Int = 20,
    capacity: Int = 100,
    private val liftingCapacity: Int = 100000
) : Liner2(name, speed, capacity) {
    override fun printInformationOfShip() {
        super.printInformationOfShip()
        println("Грузоподъемность: $liftingCapacity")
    }

    override fun load() {
        println("$name: активирует погрузочный кран")
    }
}