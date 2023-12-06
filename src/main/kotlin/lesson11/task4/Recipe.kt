package lesson11.task4

class Recipe(
    val nameOfRecipe: String,
    val favorites: Boolean = false,
    val listOfIngridients: List<Ingridient>,
    val numberOfPortions: Int,
)
{
    fun getRecipe(){
        println("Вы смотрите рецепт: \"$nameOfRecipe\"")
        if (favorites) println("Этот рецепт находится в избранном")
        else println("Этот рецепт не находится в избранном")
        listOfIngridients.forEach { println("${it.nameOfIngridient} - ${it.numberOfIngridient * numberOfPortions} ${it.typeOfIngridient}") }
    }


}
class Ingridient(
    val nameOfIngridient: String,
    val numberOfIngridient: Int,
    val typeOfIngridient: String,
)
class Category(
    val nameOfCategory: String,
    val description: String,
    val listOfRecipe: List<Recipe>
)
{
    fun getCategory(){

        println(nameOfCategory)
        println(description)

    }
}