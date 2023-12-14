package lesson10

fun main() {

    print("Введите логин: ")
    val userLogin = readln()
    print("Введите пароль: ")
    val userPassword = readln()
    val token = authorizations(userLogin, userPassword)
    if (token != null) println("Содержимое корзины ${getBasket(token)}.") else println("Ошибка авторизации! token = $token")

}

fun getToken(): String {
    val range = ('0'..'9') + ('A'..'Z') + ('a'..'z')
    return (1..LENGTH_OF_TOKEN).map { range.random() }.joinToString("")
}

fun authorizations(userLogin: String, userPassword: String): String? {
    return if ((userLogin == LOGIN) && (userPassword == PASSWORD)) {
        val token = getToken()
        token
    } else null
}

fun getBasket(token: String?): List<String>? {
    return if (token != null) {
        basket
    } else null
}


const val LOGIN = "123"
const val PASSWORD = "123"
val basket = listOf("новогодняя игрушка", "книга", "весы", "вешалки", "картина")
const val LENGTH_OF_TOKEN = 32
