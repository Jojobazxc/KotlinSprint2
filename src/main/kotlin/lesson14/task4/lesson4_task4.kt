package lesson14.task4

fun main() {
    val moon = Satellite("Луна")
    val phobos = Satellite("Фобос")
    val deimos = Satellite("Деймос")

    val mars = Planet("Марс", listOf(phobos, deimos))
    mars.printInfo()
}

open class CelestialBody(
    val name: String,
    val hasAtmosphere: Boolean = false,
    val suitableForLanding: Boolean = false
) {
}

class Planet(name: String, private val satellites: List<Satellite> = emptyList()) : CelestialBody(name) {
    fun printInfo() {
        println("Планета: $name")
        satellites.forEach { println("\tСпутник: ${it.name}") }
    }
}


class Satellite(name: String) : CelestialBody(name)