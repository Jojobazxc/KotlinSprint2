package lesson16.task4

fun main() {

    val order = Order(statusOfOrder = "не готов")

    val answerOfManager = order.getAnswerFromManager()
    if (answerOfManager) {
        order.changeAndPrintCurrentStatusOfOrder()
    } else return

}

class Order(private val numberOfOrder: Int = 1111, private var statusOfOrder: String) {

    fun getAnswerFromManager(): Boolean {
        println("Ответ менеджера: ")
        return readln().toBoolean()
    }

    private fun changeStatusOfOrder() {
        println("Введите один из четырех статусов заказа: не готов/создан/в пути/доставлен")
        statusOfOrder = readln()
        println("Статус заказа успешно изменен")
    }

    fun changeAndPrintCurrentStatusOfOrder() {
        changeStatusOfOrder()
        println("Текущий статус заказа: $statusOfOrder")
    }
}