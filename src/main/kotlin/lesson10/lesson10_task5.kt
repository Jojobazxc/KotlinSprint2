package lesson10

fun main() {
    print("Введите логин: ")
    val userLogin = readln()
    print("Введите пароль: ")
    val userPassword = readln()
    val token = authorizations(userLogin, userPassword)
    val contentsOfTheBasket = getBusket(token)
    if (contentsOfTheBasket != null) println("Содержимое корзины $contentsOfTheBasket.")
    else println("Ошибка авторизации!")

}

fun getToken(): String {
    val range = ('0'..'9') + ('A'..'Z') + ('a'..'z')
    return (1..LENGHT_OF_TOKEN).map { range.random() }.joinToString("")
}

fun authorizations(userLogin: String, userPassword: String): String? {
    return if ((userLogin == LOGIN) && (userPassword == PASSWORD)) {
        val token = getToken()
        token
    } else null
}

fun getBusket(token: String?): List<String>? {
    return if (token != null) {
        busket
    } else null
}


const val LOGIN = "pupkin123"
const val PASSWORD = "20048741"
val busket = listOf("новогодняя игрушка", "книга", "весы", "вешалки", "картина")
const val LENGHT_OF_TOKEN = 32
