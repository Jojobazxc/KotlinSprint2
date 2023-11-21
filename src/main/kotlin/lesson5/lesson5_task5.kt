package lesson5

import kotlin.random.Random

fun main() {

    val sizeOfList = 3
    val listOfNumbers = mutableListOf<Int>()

    for (i in 0..<sizeOfList) {
        listOfNumbers.add(Random.nextInt(START_OF_RANGE, END_OF_RANGE + 1))
    }

    val listOfUserNumbers = mutableListOf<Int>()

    for (i in 0..<sizeOfList) {
        println("Введите число от $START_OF_RANGE до $END_OF_RANGE: ")
        listOfUserNumbers.add(readln().toInt())
    }

    val resultList = listOfNumbers.intersect(listOfUserNumbers)


    when(resultList.size){
        3 -> println("Вы выиграли джекпот!!!")
        2 -> println("Вы выиграли крупный приз!!!")
        1 -> println("Вы выиграли утешительный приз!")
        0 -> println("Вы проиграли")
    }

    println("")
    print("Выиграшная комбинация: ")
    println(listOfNumbers)

}

const val START_OF_RANGE = 0
const val END_OF_RANGE = 42
