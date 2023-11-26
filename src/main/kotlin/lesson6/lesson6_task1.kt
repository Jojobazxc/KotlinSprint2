package lesson6

fun main() {

    print("Введите логин: ")
    val correctUserLogin: String = readln()
    print("Введите пароль: ")
    val correctUserPassword: String = readln()

    do {
        println("Для авторизации введите данные еще раз")
        print("Логин: ")
        val userLoginSign: String = readln()
        print("Пароль: ")
        val userPasswordSign: String = readln()
    } while (correctUserLogin != userLoginSign || correctUserPassword != userPasswordSign)

    println("Авторизация прошла успешно!")

}