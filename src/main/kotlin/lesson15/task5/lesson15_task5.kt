package lesson15.task5

fun main() {

    val cargoCar = CargoCar(capacity = 1, liftingCapacity = 2)
    cargoCar.loadingTheCar()
    cargoCar.hitTheRoad()
    cargoCar.unloadingTheCar()
    println()

    val car = Car(capacity = 3, liftingCapacity = 0)
    car.loadingTheCar()
    car.hitTheRoad()
    car.unloadingTheCar()
    println()

    val secondCar = Car(capacity = 2, liftingCapacity = 0)
    secondCar.loadingTheCar()
    secondCar.hitTheRoad()
    secondCar.loadingTheCar()
    println()

    // попытка загрузить легковушку недопустимыми значениями
    val tryCar = Car(liftingCapacity = 5, capacity = 6)
    tryCar.loadingTheCar()
    tryCar.hitTheRoad()
    tryCar.unloadingTheCar()
    // попытка загрузить легковушку недопустимыми значениями

}

class CargoCar(
    private val typeOfCar: String = "Грузовая машина",
    val capacity: Int,
    val liftingCapacity: Int,
    private var readyToUnloadingAndArrive: Boolean = false
) : HitTheRoad, LoadingTheCar, UnloadingTheCar {
    override fun loadingTheCar() {
        if (capacity <= MAX_CAPACITY_FOR_CARGO_CAR && liftingCapacity <= MAX_LIFTING_CAPACITY_FOR_CARGO_CAR) {
            println("$typeOfCar загружена кол-вом людей: $capacity ч., и кол-вом груза : $liftingCapacity т., Готова к отправлению ")
            readyToUnloadingAndArrive = true
        } else {
            println("$typeOfCar не может перевозить столько людей или груза")
            readyToUnloadingAndArrive = false
        }
    }

    override fun unloadingTheCar() {
        if (readyToUnloadingAndArrive) {
            println("$typeOfCar разгружена с кол-вом людей: $capacity ч., и кол-вом груза : $liftingCapacity т.")
        } else println("Ошибка, $typeOfCar изначально не была загружена")
    }

    override fun hitTheRoad() {
        if (readyToUnloadingAndArrive) {
            println("$typeOfCar отправлена в путь с кол-вом людей: $capacity ч., и кол-вом груза : $liftingCapacity т.")
        } else println("Ошибка, \"$typeOfCar\" не может перевозить столько людей или груза")
    }
}

class Car(
    val typeOfCar: String = "Легковая машина",
    val capacity: Int,
    val liftingCapacity: Int,
    var readyToUnloadingAndArrive: Boolean = false
) : HitTheRoad, LoadingTheCar, UnloadingTheCar {
    override fun hitTheRoad() {
        if (readyToUnloadingAndArrive) {
            println("$typeOfCar отправлена в путь с кол-вом людей: $capacity ч., и кол-вом груза : $liftingCapacity т.")
        } else println("Ошибка, \"$typeOfCar\" не может перевозить столько людей")
    }

    override fun loadingTheCar() {
        if (capacity <= MAX_CAPACITY_FOR_CAR && liftingCapacity == MAX_LIFTING_CAPACITY_FOR_CAR) {
            println("$typeOfCar загружена кол-вом людей: $capacity ч., и кол-вом груза : $liftingCapacity т., Готова к отправлению ")
            readyToUnloadingAndArrive = true
        } else {
            println("$typeOfCar не может перевозить столько людей или груза")
            readyToUnloadingAndArrive = false
        }
    }

    override fun unloadingTheCar() {
        if (readyToUnloadingAndArrive) {
            println("$typeOfCar разгружена с кол-вом людей: $capacity ч.")
        } else println("Ошибка, $typeOfCar изначально не была загружена")
    }
}


interface HitTheRoad {
    fun hitTheRoad()
}

interface LoadingTheCar {
    fun loadingTheCar()
}

interface UnloadingTheCar {
    fun unloadingTheCar()
}


const val MAX_CAPACITY_FOR_CAR = 3
const val MAX_CAPACITY_FOR_CARGO_CAR = 1
const val MAX_LIFTING_CAPACITY_FOR_CAR = 0
const val MAX_LIFTING_CAPACITY_FOR_CARGO_CAR = 2
