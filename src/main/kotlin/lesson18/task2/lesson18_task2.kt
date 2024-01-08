package lesson18.task2

fun main() {

    val fourEdgesDice = FourEdges(4)
    fourEdgesDice.getRandomNumber()
    val sixEdgesDice = SixEdges(6)
    sixEdgesDice.getRandomNumber()
    val eightEdgesDice = EightEdges(8)
    eightEdgesDice.getRandomNumber()

}

open class Dice(val quantityOfEdges: Int) {
    open fun getRandomNumber() {}

}

class FourEdges(
    quantityOfEdges: Int
) : Dice(quantityOfEdges) {
    override fun getRandomNumber() {
        println("Выпавшее число: ${(1..quantityOfEdges).random()}")
    }
}

class SixEdges(
    quantityOfEdges: Int
) : Dice(quantityOfEdges) {
    override fun getRandomNumber() {
        println("Выпавшее число: ${(1..quantityOfEdges).random()}")
    }
}

class EightEdges(
    quantityOfEdges: Int
) : Dice(quantityOfEdges) {
    override fun getRandomNumber() {
        println("Выпавшее число: ${(1..quantityOfEdges).random()}")
    }
}