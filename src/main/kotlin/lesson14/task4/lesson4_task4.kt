package lesson14.task4

fun main() {
    val moon = Satellite("Луна")
    val phobos = Satellite("Фобос")
    val deimos = Satellite("Деймос")

    val mars = Planet("Марс", listOf(phobos, deimos))
    mars.printInfo()
}