package lesson19.task4

fun main() {

    val tank = Tank(null)

    tank.armedANewPatrons(Patrons.BLUE)
    tank.takeAShot(Patrons.BLUE)
    println()
    tank.armedANewPatrons(Patrons.RED)
    tank.takeAShot(Patrons.RED)


}

enum class Patrons(val damage: Int, name: String) {
    BLUE(5, "Cиние"),
    GREEN(10, "Зеленые"),
    RED(20, "Красные"),
}

class Tank(private var typeOfPatrons: Patrons?) {

    fun armedANewPatrons(patrons: Patrons) {
        typeOfPatrons = patrons
        println("Перезарядка патронами вида: ${patrons.name}")
    }

    fun takeAShot(patrons: Patrons) {
        println("Произведен выстрел патронами вида: ${patrons.name}. Нанесен урон: ${patrons.damage} едениц")
    }


}