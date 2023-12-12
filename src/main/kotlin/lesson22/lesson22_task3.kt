package lesson22

fun main() {

    val car1 = Car("red", 1200, 300)

    val color = car1.color
    val mass = car1.mass
    val power = car1.power

    println(color)
    println(mass)
    println(power)

}

data class Car(val color: String, val mass: Int, val power: Int)