package lesson18.task1

class Order {

    fun getInfoAboutOrder(
        numberOfOrder: Int,
        product: String,
    ) {
        println("Заказан товар: $product")
    }

    fun getInfoAboutOrder(
        numberOfOrder: Int,
        products: List<String>,
    ) {
        println("Заказаны следующие товары: ${products.joinToString(", ")}")
    }

}