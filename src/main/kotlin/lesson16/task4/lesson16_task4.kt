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