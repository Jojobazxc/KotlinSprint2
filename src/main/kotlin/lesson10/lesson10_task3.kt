package lesson10

fun main() {

    print("Введите длину пароля: ")

    val randomPassword = createRandomPassword(readln().toInt())
    println(randomPassword)

}

fun createRandomPassword(lengthOfPassword: Int): String {

    val allowedSymbols = ('!'..')')
    val allowedNumbers = ('0'..'9')
    var password = ""
    for (i in 1..lengthOfPassword) {
        password += if (i % 2 == 0) (allowedSymbols).random()
        else (allowedNumbers).random()
    }
    return password
}