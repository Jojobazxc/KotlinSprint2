package lesson17.task4

fun main() {

    val package1 = Package(1, "Склад1")

    package1.currentGeo = "Склад2"
    package1.currentGeo = "Склад3"

    println("Счетчик перемещений: ${package1.countOfChange}")

}