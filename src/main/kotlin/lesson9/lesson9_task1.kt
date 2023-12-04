package lesson9

fun main() {

    val listOfIngredients = listOf("яйцо", "помидор", "лук", "масло", "соль")

    println("В рецепте есть следующие ингредиенты:")
    listOfIngredients.forEach {
        println(it)
    }

}