package lesson20

fun main() {

    val userName = "user"
    val greetings = { username : String -> "C наступающим Новым Годом, $username" }

    println(greetings(userName))

}