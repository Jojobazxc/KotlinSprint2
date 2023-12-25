package lesson17.task2

fun main() {
    val ship1 = Ship()
    ship1.name = "Ship2"
}

class Ship {
    var name: String = "Ship"
        set(value) {
            field = "Ship"
            println("Имя $field нельзя перезаписать")
        }
    var speed: Int = 50
    var port: String = "Port1"
}