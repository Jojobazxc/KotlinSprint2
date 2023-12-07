package lesson18.task2

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