package lesson15.task5

fun main() {

    val cargoCar = CargoCar()
    cargoCar.loadingTheCargo(2)
    cargoCar.loadingThePassengers(1)
    println()
    cargoCar.hitTheRoad()
    println()
    cargoCar.unloadingThePassengers(1)
    cargoCar.unloadingTheCargo(2)
    println()
    val car = Car()
    car.loadingThePassengers(3)
    println()
    car.hitTheRoad()
    println()
    car.unloadingThePassengers(3)
    println()
    car.loadingThePassengers(2)
    println()
    car.hitTheRoad()
    println()
    car.unloadingThePassengers(2)

}

class CargoCar(
    private val typeOfCar: String = "Грузовая машина",
    private var capacity: Int = 1,
    private var currentPassengers: Int = 0,
    private val liftingCapacity: Int = 2,
    private var currentCargo: Int = 0,
) : HitTheRoad, LoadingTheCargo, UnloadingTheCargo, LoadingThePassengers, UnloadingThePassengers {
    override fun hitTheRoad() {
        println("$typeOfCar отправилась в путь с $currentPassengers пассажир(ом)/(ами) и $currentCargo т. груза")
    }

    override fun loadingTheCargo(quantityOfCargo: Int) {
        if (currentCargo + quantityOfCargo <= liftingCapacity) {
            currentCargo += quantityOfCargo
            println("Груз добавлен, текущее кол-во груза: $currentCargo т.")
        } else println("Достигнута максимальная вместимость для груза")
    }

    override fun unloadingTheCargo(quantityOfCargo: Int) {
        if (quantityOfCargo <= currentCargo && currentCargo >= 0) {
            currentCargo -= quantityOfCargo
            println("Груз выгружен. Текущее кол-во груза: $currentCargo")
        } else println("Отсутствует груз для выгрузки")

    }

    override fun loadingThePassengers(quantityOfPassengers: Int) {
        if (currentPassengers + quantityOfPassengers <= capacity) {
            currentPassengers += quantityOfPassengers
            println("Пассажир(ы) добавлен(ы), текущее кол-во пассажиров: $currentPassengers")
        } else println("Достигнута максимальная вместимость для пассажиров")
    }

    override fun unloadingThePassengers(quantityOfPassengers: Int) {
        if (quantityOfPassengers <= currentPassengers && currentPassengers >= 0) {
            currentPassengers -= quantityOfPassengers
            println("Пассажир(ы) выгружен(ы). Текущее кол-во пассажиров: $currentPassengers")
        } else println("Отсутствуют пассажиры для выгрузки")

    }
}

class Car(
    private val typeOfCar: String = "Легковая машина",
    private var capacity: Int = 3,
    private var currentPassengers: Int = 0,
) : HitTheRoad, LoadingThePassengers, UnloadingThePassengers {
    override fun hitTheRoad() {
        println("$typeOfCar отправилась в путь с $currentPassengers пассажир(ом)/(ами)")
    }

    override fun loadingThePassengers(quantityOfPassengers: Int) {
        if (currentPassengers + quantityOfPassengers <= capacity) {
            currentPassengers += quantityOfPassengers
            println("Пассажир(ы) добавлен(ы), текущее кол-во пассажиров: $currentPassengers")
        } else println("Достигнута максимальная вместимость для пассажиров")
    }

    override fun unloadingThePassengers(quantityOfPassengers: Int) {
        if (quantityOfPassengers <= currentPassengers && currentPassengers >= 0) {
            currentPassengers -= quantityOfPassengers
            println("Пассажир(ы) выгружен(ы). Текущее кол-во пассажиров: $currentPassengers")
        } else println("Отсутствуют пассажиры для выгрузки")
    }
}

interface HitTheRoad {
    fun hitTheRoad()
}

interface LoadingThePassengers {
    fun loadingThePassengers(quantityOfPassengers: Int)
}

interface UnloadingThePassengers {
    fun unloadingThePassengers(quantityOfPassengers: Int)
}

interface LoadingTheCargo {
    fun loadingTheCargo(quantityOfCargo: Int)
}

interface UnloadingTheCargo {
    fun unloadingTheCargo(quantityOfCargo: Int)
}



