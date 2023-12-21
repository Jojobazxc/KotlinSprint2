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

class UserData(val userLogin: String, val userPassword: String) {

    private val correctPassword = "123456"

    fun getRightPassword(userPassword: String): Boolean {
        return userPassword == correctPassword
    }
}