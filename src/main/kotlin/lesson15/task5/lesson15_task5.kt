package lesson15.task5

fun main() {

    val cargoCar = CargoCar(capacity = 1, liftingCapacity = 2)
    val car = Car(capacity = 3, liftingCapacity = 0)

    cargoCar.loadingTheCar(cargoCar.typeOfCar, 1, 2)
    cargoCar.hitTheRoad(cargoCar.typeOfCar, 1, 2)
    cargoCar.unloadingTheCar(cargoCar.typeOfCar, 1, 2)
    println()
    car.loadingTheCar(car.typeOfCar, 3, 0)
    car.hitTheRoad(car.typeOfCar, 3, 0)
    car.unloadingTheCar(car.typeOfCar, 3, 0)
    println()
    car.loadingTheCar(car.typeOfCar, 2, 0)
    car.hitTheRoad(car.typeOfCar, 2, 0)
    car.unloadingTheCar(car.typeOfCar, 2, 0)


}

class CargoCar(
    val typeOfCar: String = "Грузовая машина",
    val capacity: Int,
    val liftingCapacity: Int,
) : HitTheRoad, LoadingTheCar, UnloadingTheCar

class Car(
    val typeOfCar: String = "Легковая машина",
    val capacity: Int,
    val liftingCapacity: Int,
) : HitTheRoad, LoadingTheCar, UnloadingTheCar


interface HitTheRoad {
    fun hitTheRoad(typeOfCar: String, capacity: Int, liftingCapacity: Int) {
        println("$typeOfCar отправилась в путь с кол-вом людей: ${capacity}ч. и кол-вом груза: ${liftingCapacity}т.")
    }
}

interface LoadingTheCar {
    fun loadingTheCar(typeOfCar: String, capacity: Int, liftingCapacity: Int) {
        if (typeOfCar == "Легковая машина") {
            println("$typeOfCar была загружена кол-вом людей: ${capacity}ч. и кол-вом груза: ${liftingCapacity}т. Готова к отправлению.")
        } else if (typeOfCar == "Грузовая машина") {
            println("$typeOfCar была загружена кол-вом людей: ${capacity}ч. и кол-вом груза: ${liftingCapacity}т. Готова к отправлению.")
        }
    }
}

interface UnloadingTheCar {
    fun unloadingTheCar(typeOfCar: String, capacity: Int, liftingCapacity: Int) {
        if (typeOfCar == "Легковая машина") {
            println("$typeOfCar прибыла в место назначения с кол-вом людей: ${capacity}ч. и кол-вом груза: ${liftingCapacity}т. В процессе разгрузки")
        } else if (typeOfCar == "Грузовая машина") {
            println("$typeOfCar прибыла в место назначения с кол-вом людей: ${capacity}ч. и кол-вом груза: ${liftingCapacity}т. В процессе разгрузки")
        }
    }
}