package lesson9

fun main() {

    print("Введите пять ингредиентов через \",\": ")
    val userIngredients = readln()

    val listOfUserIngredients = userIngredients.split(", ")

    val sortedlistOfUserIngredients = listOfUserIngredients.sorted()

    println("Полученный рецепт: ")
    sortedlistOfUserIngredients.forEach {
        println(it)
    }

}