package lesson7


fun main() {

    print("Задайте длину пароля не менее 6 символов: ")
    val userLengthOfPassword = readln().toInt()

    val allowedSymbols = ('A'..'Z') + ('a'..'z') + ('0'..'9')
    var randomChar: String
    var password: String = ""

    for (i in 0..<userLengthOfPassword) {
        randomChar = (allowedSymbols).random().toString()
        password += randomChar
    }

    val containsUpperCase = password.any { it in 'A'..'Z' }
    val containsLowerCase = password.any { it in 'a'..'z' }
    val containsNumberCase = password.any { it in '0'..'9' }

    if (containsLowerCase && containsUpperCase && containsNumberCase) {
        println("Ваш пароль: $password")
        return
    }
    else{
        if (!containsUpperCase) {
            password = password.dropLast(1)
            password += ('A'..'Z').random()
            println("Ваш пароль: $password")
        }
        if (!containsLowerCase) {
            password = password.dropLast(1)
            password += ('a'..'z').random()
            println("Ваш пароль: $password")
        }
        if (!containsNumberCase) {
            password = password.dropLast(1)
            password += ('0'..'9').random()
            println("Ваш пароль: $password")
        }
    }

}


