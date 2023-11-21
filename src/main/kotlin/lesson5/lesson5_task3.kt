package lesson5

fun main() {

    val number1 = 12
    val number2 = 23

    println("Введите первое число")
    val firstUserNumber = readln().toInt()

    println("Введите второе число")
    val secondUserNumber = readln().toInt()

    val conditionForNumber1 = (number1 == firstUserNumber || number1 == secondUserNumber)
    val conditionForNumber2 = (number2 == secondUserNumber || number2 == firstUserNumber)

    if(conditionForNumber1 && conditionForNumber2) println("Поздравляем! Вы выиграли главный приз!")
    else if(conditionForNumber1 || conditionForNumber2) println("Вы выиграли утешительный приз!")
    else println("Неудача")

    println("Победная комбинация: $number1, $number2")

}
