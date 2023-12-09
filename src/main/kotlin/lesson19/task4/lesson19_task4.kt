package lesson19.task4

fun main() {

    val tank = Tank(null)

    tank.armedANewPatrons(Patrons.BLUE)
    tank.takeAShot(Patrons.BLUE)
    println()
    tank.armedANewPatrons(Patrons.RED)
    tank.takeAShot(Patrons.RED)


}


enum class Patrons(val damage: Int, name: String){
    BLUE(5, "Cиние"),
    GREEN(10, "Зеленые"),
    RED(20, "Красные"),
}