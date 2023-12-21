package lesson16.task4

import java.util.*

fun main() {
    Order2().changeReadyStatus()
}

class Order2(var readyStatus: String = "Заказ не подтверждён") {
    private val numberOfOrder = "39847164467"

    fun changeReadyStatus() {
        if (sendMassage()) {
            readyStatus = "Заказ подтверждён"
            println("Статуз заказа: $readyStatus")
        } else {
            readyStatus = "Заказ ожидает подтверждения"
            println("Статуз заказа: $readyStatus")
        }
    }

}

fun sendMassage(): Boolean {
    println("Подвердить заказ у менеджера? да/нет")
    return readln().lowercase(Locale.getDefault()) == "да"
}