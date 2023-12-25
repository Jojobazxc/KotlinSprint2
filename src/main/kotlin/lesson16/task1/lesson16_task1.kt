package lesson16.task1

fun main() {

    val cube1 = Cube((1..6).random())
    cube1.getRandomNumber()

}

class Cube(private val randomNumber: Int) {
    fun getRandomNumber() {
        println("Число на кубе: $randomNumber")
    }
}