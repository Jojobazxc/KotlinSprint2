package lesson8

fun main() {

    val arrayOfIngredients = arrayOf("яйцо", "помидор", "лук", "масло", "соль")

    println("Ингредиенты яичницы: ")
    arrayOfIngredients.forEach {
        println(it)
    }

    print("Какой элемент вы бы хотели заменить: ")
    val userIngredient = readln()

    if (userIngredient !in arrayOfIngredients) println("Такого ингредиента нет в рецепте")
    else {
        print("Введите ингредиент, на который вы хотите заменить ингредиент \"$userIngredient\": ")
        arrayOfIngredients[arrayOfIngredients.indexOf(userIngredient)] = readln()
        println("Готово! Вы сохранили следующий список: ")
        arrayOfIngredients.forEach { println(it) }
    }

}