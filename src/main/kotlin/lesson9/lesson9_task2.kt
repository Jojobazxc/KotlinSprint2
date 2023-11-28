package lesson9

fun main() {

    val listOfIngredients = mutableListOf("яйцо", "помидор", "лук")

    println("В рецепте есть базовые ингредиенты: ")
    listOfIngredients.forEach {
        println(it)
    }

    print("Желаете добавить еще? ")
    val userAnswer = readln()
    val userIngredient: String

    if (userAnswer == "да"){
        println("Какой ингредиент вы хотите добавить?")
        userIngredient = readln()
        listOfIngredients.add(userIngredient)
    }
    else return

    println("Теперь в рецепте есть следующие ингредиенты:")
    listOfIngredients.forEach {
        println(it)
    }

}