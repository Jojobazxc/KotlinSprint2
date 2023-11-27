package lesson8

fun main() {

    val arrayOfIngredients = arrayOf("яйцо", "помидор", "лук", "масло", "соль")

    print("Какой ингредиент вы хотите найти: ")
    val userIngredient = readln()
    var flag: Boolean = false

    for (i in arrayOfIngredients) {
        if (i == userIngredient) {
            flag = true
        }
    }
    if (flag) println("Ингредиент \"$userIngredient\" в рецепте есть")
    else println("Такого ингредиента в рецепте нет")

}