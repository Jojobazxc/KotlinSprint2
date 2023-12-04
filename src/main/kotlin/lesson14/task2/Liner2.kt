package lesson14.task2

open class Liner2(
    val name: String = "Лайнер1",
    val speed: Int = 40,
    val сapacity: Int = 10000,
) {
    open fun printInformationOfShip() {
        println("Название: $name")
        println("Cкорость: $speed")
        println("Вместительность: $сapacity")
    }

    fun ladderExtension() {
        println("$name: выдвигает горизонтальный трап со шкафута")
    }
}

class Icebreaker2(
    name: String = "Ледокол",
    speed: Int = 15,
    capacity: Int = 500,
    val breakIce: Boolean = true
) : Liner2(name, speed, capacity) {
    override fun printInformationOfShip() {
        super.printInformationOfShip()
        println("Способность колоть лед: $breakIce")
    }

    fun openingTheGate() {
        println("$name: открывает ворота со стороны кормы")
    }
}

class CargoShip2(
    name: String = "Грузовой корабль",
    speed: Int = 20,
    capacity: Int = 100,
    val liftingCapacity: Int = 100000
) : Liner2(name, speed, capacity) {
    override fun printInformationOfShip() {
        super.printInformationOfShip()
        println("Грузоподъемность: $liftingCapacity")
    }

    fun activationOfLoadingCrane() {
        println("$name: активирует погрузочный кран")
    }
}