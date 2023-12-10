package lesson20

fun main() {

    val listOfElements = mutableListOf("элемент1", "элемент2", "элемент3", "элемент4", "элемент5", "элемент6")

    val listOfLambdas = listOfElements.map { element -> { println("Нажат элемент: $element") } }

    listOfLambdas.forEach { if (listOfLambdas.indexOf(it) % 2 != 0 ) it.invoke()  }

}