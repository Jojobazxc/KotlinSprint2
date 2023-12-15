package lesson11.task4

fun main() {

    val ingridient1 = Ingridient(
        nameOfIngridient = "Булочки для бургеров",
        numberOfIngridient = 2,
        typeOfIngridient = "шт",
    )
    val ingridient2 = Ingridient(
        nameOfIngridient = "Яйцо",
        numberOfIngridient = 1,
        typeOfIngridient = "шт",
    )
    val ingridient3 = Ingridient(
        nameOfIngridient = "Грибы",
        numberOfIngridient = 50,
        typeOfIngridient = "гр",
    )
    val ingridient4 = Ingridient(
        nameOfIngridient = "Сыр",
        numberOfIngridient = 150,
        typeOfIngridient = "гр",
    )
    val listOfIngridients = listOf(ingridient1, ingridient2, ingridient3, ingridient4)

    println("Сколько порций вы хотите?")
    val numberOfPortions = readln().toInt()

    val recipe = Recipe(
        nameOfRecipe = "Бургер с грибами и сыром",
        numberOfPortions = numberOfPortions,
        listOfIngridients = listOfIngridients,
        favorites = true,
    )
    val listOfRecipe = listOf(recipe)

    val category = Category(
        nameOfCategory = "Бургеры",
        description = "Рецепты всех популярных видов бургеров",
        listOfRecipe = listOfRecipe,
    )

    category.getCategory()
    recipe.getRecipe()
    

}