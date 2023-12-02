package lesson7

fun main() {

    print("Задайте длину пароля не менее 6 символов: ")
    val userLengthOfPassword = readln().toInt()

    val lowerCase = ('a'..'z')
    val upperCase = ('A'..'Z')
    val numbers = ('0'..'9')
    val allChars = lowerCase + upperCase + numbers

    val starOfPassword = lowerCase.random().toString() + upperCase.random().toString() + numbers.random().toString()
    val password = starOfPassword + (1..(userLengthOfPassword - 3)).map { allChars.random() }.joinToString("")
    password.toCharArray().apply { shuffle() }
    println("Сгенерированный пароль: $password")

}
