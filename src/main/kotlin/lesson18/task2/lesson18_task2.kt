package lesson18.task2

fun main() {

    val fourEdgesDice = FourEdges(4)
    fourEdgesDice.getRandomNumber()
    val sixEdgesDice = SixEdges(6)
    sixEdgesDice.getRandomNumber()
    val eightEdgesDice = EightEdges(8)
    eightEdgesDice.getRandomNumber()

}

open class Dice {

    open fun getRandomNumber() {}

}

class FourEdges(
    private val quantityOfEdges: Int
) : Dice() {
    override fun getRandomNumber() {
        println("Выпавшее число: ${(1..quantityOfEdges).random()}")
    }
}

class SixEdges(
    private val quantityOfEdges: Int
) : Dice() {
    override fun getRandomNumber() {
        println("Выпавшее число: ${(1..quantityOfEdges).random()}")
    }
}

class EightEdges(
    private val quantityOfEdges: Int
) : Dice() {
    override fun getRandomNumber() {
        println("Выпавшее число: ${(1..quantityOfEdges).random()}")
    }
}