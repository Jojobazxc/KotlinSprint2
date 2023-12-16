package lesson21

fun main() {

    val listOfNumbers: List<Int> = mutableListOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12)
    listOfNumbers.evenNumbersSum(listOfNumbers)

}

fun List<Int>.evenNumbersSum(listOfNumbers: List<Int>) {

    var sumOfEvenNumbers = 0
    listOfNumbers.forEach { number -> if (number % 2 == 0) sumOfEvenNumbers += number }
    println("Сумма всех четных чисел = $sumOfEvenNumbers")

}