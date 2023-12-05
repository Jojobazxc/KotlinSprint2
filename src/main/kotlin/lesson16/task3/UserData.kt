package lesson16.task3


class UserData(val userLogin: String, val userPassword: String) {

    private val correctPassword = "123456"

    fun getRightPassword(userPassword: String): Boolean {
        return if (userPassword == correctPassword) {
            true
        } else false
    }
}