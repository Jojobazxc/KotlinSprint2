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
    val areEqual = userAnswer.equals(RIGHT_ANSWER, ignoreCase = true)

    if (areEqual){
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

const val RIGHT_ANSWER = "да"