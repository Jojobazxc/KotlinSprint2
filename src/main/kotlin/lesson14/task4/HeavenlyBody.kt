package lesson14.task4

open class CelestialBody(val name: String, val hasAtmosphere: Boolean = false, val suitableForLanding: Boolean = false) {
}

class Planet(name: String, val satellites: List<Satellite> = emptyList()) : CelestialBody(name) {
    fun printInfo() {
        println("Планета: $name")
        satellites.forEach { println("  Спутник: ${it.name}") }
    }
}


class Satellite(name: String) : CelestialBody(name)