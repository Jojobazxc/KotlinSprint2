package lesson9

import java.util.*

fun main() {

    val listOfIngredients = sortedSetOf<String>()

    var userIngredient: String
    println("Введите пять ингредиентов: ")

    for (i in 1..5) {
        userIngredient = readln()
        listOfIngredients.add(userIngredient)
    }

    val separator = ", "
    val stringOfList = listOfIngredients.joinToString(separator)

    println(stringOfList.replaceFirstChar { it.titlecase(Locale.getDefault()) })

}