package lesson10

fun main() {

    print("Введите длину пароля: ")

    val randomPassword = createRandomPassword(readln().toInt())
    println(randomPassword)

}

fun createRandomPassword(lengthOfPassword: Int): String {

    val allowedSymbols = "!\"#$%&\'()*+,-./ " + "0123456789"
    return (1..lengthOfPassword).map { (allowedSymbols).random() }.joinToString("")

}