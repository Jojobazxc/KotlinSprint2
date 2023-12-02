package lesson8

fun main() {

    val arrayOfIngredients = arrayOf("яйцо", "помидор", "лук", "масло", "соль")

    print("Какой ингредиент вы хотите найти: ")
    val userIngredient = readln()


    for (i in arrayOfIngredients) {
        if (i == userIngredient) {
            println("Ингредиент \"$userIngredient\" в рецепте есть")
            return
        }
    }

    println("Такого ингредиента в рецепте нет")

}