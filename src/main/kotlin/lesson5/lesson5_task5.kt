package lesson5

import kotlin.random.Random

fun main() {

    val sizeOfList = 3
    val listOfNumbers = mutableListOf<Int>()

    for (i in 0..<sizeOfList) {
        listOfNumbers.add(Random.nextInt(0, 43))
    }

    val listOfUserNumbers = mutableListOf<Int>()

    for (i in 0..<sizeOfList) {
        println("Введите число от 0 до 42: ")
        listOfUserNumbers.add(readln().toInt())
    }

    val resultList = listOfNumbers.intersect(listOfUserNumbers)

    if (resultList.size == 3) println("Вы выиграли джекпот!!!")
    else if (resultList.size == 2) println("Вы выиграли крупный приз!!!")
    else if (resultList.size == 1) println("Вы выиграли утешительный приз!")
    else println("Вы проиграли")

    println("")
    print("Выиграшная комбинация: ")
    println(listOfNumbers)

}


