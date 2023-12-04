package lesson14.task1

open class Liner(
    val name: String = "Лайнер1",
    val speed: Int = 40,
    val сapacity: Int = 10000,
) {
    open fun printInformationOfShip() {
        println("Название: $name")
        println("Cкорость: $speed")
        println("Вместительность: $сapacity")
    }
}

class Icebreaker(
    name: String = "Ледокол",
    speed: Int = 15,
    capacity: Int = 500,
    val breakIce: Boolean = true
) : Liner(name, speed, capacity) {
    override fun printInformationOfShip() {
        super.printInformationOfShip()
        println("Способность колоть лед: $breakIce")
    }
}

class CargoShip(
    name: String = "Грузовой корабль",
    speed: Int = 20,
    capacity: Int = 100,
    val liftingCapacity: Int = 100000
) : Liner(name, speed, capacity) {
    override fun printInformationOfShip() {
        super.printInformationOfShip()
        println("Грузоподъемность: $liftingCapacity")
    }
}