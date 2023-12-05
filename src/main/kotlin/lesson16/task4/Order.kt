package lesson16.task4

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