package lesson18.task1

fun main() {

    val order1 = Order()
    order1.getInfoAboutOrder(
        1,
        "Игрушка"
    )
    val order2 = Order()
    order2.getInfoAboutOrder(
        2,
        listOf("Игрушка", "Посуда", "Корм")
    )

}

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