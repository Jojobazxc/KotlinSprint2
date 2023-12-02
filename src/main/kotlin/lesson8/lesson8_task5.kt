package lesson8


fun main() {

    println("Введите кол-во ингредиентов в рецепте: ")
    val userSizeOfArray = readln().toInt()

    val arrayOfIngredients = Array(userSizeOfArray) { "" }

    for (i in arrayOfIngredients) {
        println("Ингредиент ${arrayOfIngredients.indexOf(i) + 1}: ")
        arrayOfIngredients[arrayOfIngredients.indexOf(i)] = readln()
    }

    println("Получившийся рецепт:")
    arrayOfIngredients.forEach { println("Ингредиент ${arrayOfIngredients.indexOf(it) + 1}: $it") }

}


