package lesson20

fun main() {

    val robot = Robot("Джарвис")

    val randomPhrase = robot.say()
    println("${robot.name}: $randomPhrase")

    val setModifier: (String) -> String = { randomPhrase.reversed().lowercase() }

    println("${robot.name}: ${setModifier(randomPhrase)}")

}

class Robot(val name: String) {
    private val listOfPhrases =
        listOf("Привет", "Давай поиграем!", "Как твое настроение!", "Смотри как я умею!", "Молодец!")

    fun say(): String {
        return listOfPhrases.random()
    }
}

