package lesson9

import java.util.*

fun main() {

    val listOfIngredients = mutableSetOf<String>()

    var userIngredient: String
    println("Введите пять ингредиентов: ")

    for(i in 0..<5){
        userIngredient = readln()
        listOfIngredients.add(userIngredient)
    }

    val sortedListOfIngredients = listOfIngredients.sorted()
    println(sortedListOfIngredients)

    val separator = ", "
    val stringOfList = sortedListOfIngredients.joinToString(separator)

    println(stringOfList.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() })

}