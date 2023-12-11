package lesson21

fun main() {

    val string = String()
    string.vowelCount("hello")

}


fun String.vowelCount(string: String) {

    var countOfVowel = 0
    string.toCharArray().forEach { if (it in "aeyuio") countOfVowel++ }
    println("Количество гласных = $countOfVowel")

}