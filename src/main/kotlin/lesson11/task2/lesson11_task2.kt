package lesson11.task2

fun main() {

    val user = User(
        userLogin = "log123",
        userPassword = "pass123",
        userEmail = "123@email.m",
        userToken = "8741token"
    )
    user.fillingOutBio()
    user.changeThePassword()
    user.getData()

}