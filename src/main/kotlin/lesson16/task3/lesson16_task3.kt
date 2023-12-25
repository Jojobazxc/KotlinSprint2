package lesson16.task3

fun main() {

    println("Введите логин:")
    val registerLogin = readln()
    println("Введите пароль:")
    val registerPassword = readln()
    val user = UserData(registerLogin, registerPassword)

    println("Введите пароль еще раз")
    val readUserPassword = readln()

    val resultOfCheck = user.isRightPassword(readUserPassword)

    println("Результат проверки пароля: $resultOfCheck")

}

class UserData(val userLogin: String, private val userPassword: String) {
    fun isRightPassword(readUserPassword: String): Boolean {
        return readUserPassword == userPassword
    }
}