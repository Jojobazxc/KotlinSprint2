package lesson16.task4

fun main() {

    val order = Order()

    val answerOfManager = order.getAnswerFromManager()
    if (answerOfManager) {
        println("Введите один из четырех статусов заказа: не готов/создан/в пути/доставлен")
        val newStatus = readln()
        order.changeStatusOfOrder(answerOfManager, newStatus)
        order.printCurrentStatusOfOrder()
    } else return

}

class Order {
    private var statusOfOrder = "не готов"
    private val numberOfOrder = 11111

    fun getAnswerFromManager(): Boolean {
        println("Ответ менеджера: ")
        return readln().toBoolean()
    }

    fun changeStatusOfOrder(answerOfManager: Boolean, newStatus: String) {
        if (answerOfManager) {
            statusOfOrder = newStatus
            println("Статус заказа успешно изменен")
        } else println("Менеджер не одобрил заявку")
    }

    fun printCurrentStatusOfOrder() {
        println("Текущий статус заказа: $statusOfOrder")
    }
}