package lesson9


fun main() {

    val listOfIngredients = mutableListOf(2, 50, 15)

    print("Какое количество порций необходимо? ")
    val numberOfPortions = readln().toInt()

    val modernListOfIngredients = listOfIngredients.map {
        it * numberOfPortions
    }

    println(
        "На $numberOfPortions порций вам понадобится: Яиц - ${modernListOfIngredients[0]}," +
                " молока - ${modernListOfIngredients[1]}, сливочного масла - ${modernListOfIngredients[2]} "
    )

}