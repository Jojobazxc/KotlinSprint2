package lesson7


fun main() {

    var numberForSign: Int
    var enterUserNumber: Int

    do {

        numberForSign = (1000..9999).random()
        println("Ваш код для авторизации: $numberForSign.")
        print("Введите полученный код для авторизации: ")
        enterUserNumber = readln().toInt()

    } while (enterUserNumber != numberForSign)

    println("Добро пожаловать!")

}