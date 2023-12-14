package lesson11.task2

class User(
    val userLogin: String,
    var userPassword: String,
    val userToken: String,
    val userEmail: String,
    var userBio: String = "",
)
{

    fun getData(){
        println("Логин пользователя: $userLogin")
        println("Пароль пользователя: $userPassword")
        println("Почта пользователя: $userEmail")
        println("Идентификатор пользователя: $userToken")
        println("Биография пользователя: $userBio")
    }

    fun fillingOutBio(){
        println("Хотите заполнить свою биографию? true/false")
        val answer = readln().toBoolean()
        if (answer) userBio = readln()
        println()
    }

    fun changeThePassword(){
        println("Хотите сменить пароль? true/false")
        val answer = readln().toBoolean()
        if (answer){
            print("Введите старый пароль: ")
            val oldPass = readln()
            if (oldPass == userPassword) {
                print("Введите новый пароль: ")
                userPassword = readln()
            } else println("Вы ввели неверный пароль!")
        }
        println()
    }
}