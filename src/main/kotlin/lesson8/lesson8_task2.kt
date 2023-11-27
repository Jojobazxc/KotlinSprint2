package lesson8

fun main() {

    val arrayOfIngredients = arrayOf("яйцо", "помидор", "лук", "масло", "соль")

    print("Какой ингредиент вы хотите найти: ")
    val userIngredient = readln()

    for (i in arrayOfIngredients) {
        if (i == userIngredient) {
            println("Ингредиент \"$i\" в рецепте есть")
        } else {
            println("Такого ингредиента в рецепте нет")
            break
        }
    }

}