package lesson4

fun main() {

    println("Повреждения корабля: да/нет")
    val damageOfShip: Boolean = (readln() == "да")
    println("Число экипажа:")
    val numberOfCrew = readln().toInt()
    println("Количество ящиков с провизией на борту:")
    val numberOfProvisions = readln().toInt()
    println("Благоприятность метеоусловий")
    val weatherIsClear: Boolean = (readln() == "да")

    val mainNumberOfCrew = 55..70
    val mainNumberOfProvisions = 50
    val alternativeNumberOfCrew = 70

    println("Разрешение на отбытие: ${(!damageOfShip && (numberOfCrew in mainNumberOfCrew) && (numberOfProvisions > mainNumberOfProvisions) && weatherIsClear) || (damageOfShip && (numberOfCrew == alternativeNumberOfCrew) && (numberOfProvisions >= mainNumberOfProvisions) && weatherIsClear)}")

}