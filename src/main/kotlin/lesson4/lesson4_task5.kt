package lesson4

fun main() {

    println("Повреждения корабля: true/false")
    val damageOfShip: Boolean = readln().toBoolean()
    println("Число экипажа:")
    val numberOfCrew = readln().toInt()
    println("Количество ящиков с провизией на борту:")
    val numberOfProvisions = readln().toInt()
    println("Благоприятность метеоусловий: true/false")
    val weatherIsClear: Boolean = readln().toBoolean()

    val mainNumberOfCrew = 55..70
    val mainNumberOfProvisions = 50
    val alternativeNumberOfCrew = 70

    val mainCondition = (!damageOfShip && (numberOfCrew in mainNumberOfCrew)
            && (numberOfProvisions > mainNumberOfProvisions) && weatherIsClear)
    val alternativeCondition = (damageOfShip && (numberOfCrew == alternativeNumberOfCrew)
            && (numberOfProvisions >= mainNumberOfProvisions) && weatherIsClear)
    val permission = mainCondition || alternativeCondition

    println("Разрешение на отбытие: $permission")

}