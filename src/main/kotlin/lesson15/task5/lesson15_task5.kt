package lesson15.task5

fun main() {

    val cargoCar = CargoCar()
    cargoCar.loadingTheCar(1, 1)
    cargoCar.loadingTheCar(0, 1)
    println()
    cargoCar.hitTheRoad()
    println()
    cargoCar.unloadingTheCar(1, 1)
    cargoCar.unloadingTheCar(0, 1)
    println()
    val car = Car()
    car.loadingTheCar(1, 0)
    car.loadingTheCar(2, 0)
    println()
    car.hitTheRoad()
    println()
    car.unloadingTheCar(3, 0)
    println()
    car.loadingTheCar(2, 0)
    println()
    car.hitTheRoad()
    println()
    car.unloadingTheCar(2, 0)

}

class CargoCar(
    private val typeOfCar: String = "Грузовая машина",
    private var capacity: Int = 1,
    private var currentPassengers: Int = 0,
    private val liftingCapacity: Int = 2,
    private var currentCargo: Int = 0,
) : HitTheRoad, LoadingTheCar, UnloadingTheCar {
    override fun hitTheRoad() {
        println("$typeOfCar отправилась в путь с $currentPassengers пассажир(ом)/(ами) и $currentCargo т. груза")
    }

    override fun loadingTheCar(quantityOfPassengers: Int, quantityOfCargo: Int) {
        if (currentPassengers + quantityOfPassengers <= capacity && currentCargo + quantityOfCargo <= liftingCapacity) {
            currentPassengers += quantityOfPassengers
            currentCargo += quantityOfCargo
            println("Пассажир(ы) и груз добавлен(ы). Текущее кол-во пассажиров: $currentPassengers, груза: $currentCargo")
        } else println("Достигнута максимальная вместимость, или грузовая машина не может вмещать столько пассажиров или груза")
    }

    override fun unloadingTheCar(quantityOfPassengers: Int, quantityOfCargo: Int) {
        if (quantityOfCargo <= currentCargo && currentCargo >= 0) {
            currentCargo -= quantityOfCargo
            println("Груз выгружен. Текущее кол-во груза: $currentCargo")
        } else println("Отсутствует груз для выгрузки")
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
    private val liftingCapacity: Int = 0,
    private var currentCargo: Int = 0,
) : HitTheRoad, LoadingTheCar, UnloadingTheCar {
    override fun hitTheRoad() {
        println("$typeOfCar отправилась в путь с $currentPassengers пассажир(ом)/(ами) и $currentCargo т. груза")
    }

    override fun loadingTheCar(quantityOfPassengers: Int, quantityOfCargo: Int) {
        if (currentPassengers + quantityOfPassengers <= capacity) {
            currentPassengers += quantityOfPassengers
            currentCargo += quantityOfCargo
            println("Загружен(ы) $quantityOfPassengers пассажир(а). Текущее кол-во пассажиров: $currentPassengers")
        } else println("Достигнута максимальная вместимость, или легковая машина не может вмещать столько пассажиров")
        if (quantityOfCargo > 0) println("$typeOfCar не может перевозить груз")
    }

    override fun unloadingTheCar(quantityOfPassengers: Int, quantityOfCargo: Int) {
        if (quantityOfCargo > 0) {
            println("В легковой машине нельзя перевозить/разгружать груз")
        }
        if (quantityOfPassengers <= currentPassengers && currentPassengers >= 0) {
            currentPassengers -= quantityOfPassengers
            println("Пассажир(ы) выгружен(ы). Текущее кол-во пассажиров: $currentPassengers")
        } else println("Отсутствуют пассажиры для выгрузки")
    }
}

interface HitTheRoad {
    fun hitTheRoad()
}

interface LoadingTheCar {
    fun loadingTheCar(quantityOfPassengers: Int, quantityOfCargo: Int)
}

interface UnloadingTheCar {
    fun unloadingTheCar(quantityOfPassengers: Int, quantityOfCargo: Int)
}

