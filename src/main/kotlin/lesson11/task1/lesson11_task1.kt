package lesson11.task1

fun main() {

    val userA = UserData(
        userLogin = "pochechkin8741",
        userPassword = "87418741",
        userToken = "pochka88774411",
        userEmail = "pochechkin8741@yahoo.com"
    )
    val userB = UserData(
        userLogin = "pechyonkin1478",
        userPassword = "14781478",
        userToken = "pechen11447788",
        userEmail = "pechyonka1478@yahoo.com"
    )
    println("Логин первого пользователя: ${userA.userLogin}")
    println("Пароль первого пользователя: ${userA.userPassword}")
    println("Почта первого пользователя: ${userA.userEmail}")
    println("Идентификатор первого пользователя: ${userA.userToken}")
    println()
    println("Логин второго пользователя: ${userB.userLogin}")
    println("Пароль второго пользователя: ${userB.userPassword}")
    println("Почта второго пользователя: ${userB.userEmail}")
    println("Идентификатор второго пользователя: ${userB.userToken}")

}