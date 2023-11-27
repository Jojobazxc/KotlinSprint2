package lesson8

fun main() {

    val arrayOfIngredients = arrayOf("яйцо", "помидор", "лук", "масло", "соль")

    println("Ингредиенты яичницы: ")
    arrayOfIngredients.forEach {
        println(it)
    }

    print("Какой элемент вы бы хотели заменить: ")
    val userIngredient = readln()

    val newUserIngredient: String
    if (userIngredient !in arrayOfIngredients) println("Такого ингредиента нет в рецепте")
    else {
        print("Введите ингредиент, на который вы хотите заменить ингредиент \"$userIngredient\": ")
        newUserIngredient = readln()
        arrayOfIngredients[arrayOfIngredients.indexOf(userIngredient)] = newUserIngredient
        println("Готово! Вы сохранили следующий список: ")
        arrayOfIngredients.forEach { println(it) }
    }

}