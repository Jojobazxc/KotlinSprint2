package lesson10

fun main() {

    print("Введите логин: ")
    val userLogin = readln()

    print("Введите пароль: ")
    val userPassword = readln()

    getRightLength(userLogin, userPassword)

}

fun getRightLength(userLogin: String, userPassword: String) {
    if((userLogin.length < LENGTH_OF_DATA) || (userPassword.length < LENGTH_OF_DATA))
        println("Логин и пароль недостаточно длинные")
    else println("Добро пожаловать!")
}

const val LENGTH_OF_DATA = 4