package lesson16.task3

fun main() {

    println("Введите логин:")
    val userLogin = readln()
    println("Введите пароль:")
    val userPassword = readln()

    val user = UserData(userLogin, userPassword)
    val resultOfCheck = user.getRightPassword(userPassword)

    println("Результат проверки пароля: $resultOfCheck")

}