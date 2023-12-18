package lesson17.task5

fun main() {

    val user1 = UserData("123456", "vasya")

    user1.password = "123" // попытка изменить пароль

    println("Пароль: ${user1.password}") // попытка прочитать пароль

    user1.login = "qwertyt123" // изменение логина

}

class UserData(password: String, login: String) {

    private val fillChar = '*'
    private val charArray = (CharArray(password.length) { fillChar }).joinToString("")
    var password = password
        set(value) {
            println("Вы не можете изменить пароль")
            field = password
        }
        get() = charArray
    var login = login
        set(value) {
            field = value
            println("Логин успешно изменена на $field")
        }
}