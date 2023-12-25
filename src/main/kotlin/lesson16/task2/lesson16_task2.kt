package lesson16.task2

fun main() {

    val circle = Circle(6.00F)

    circle.getLengthOfCircle()
    circle.getAreaOfCircle()

}

class Circle(private val radius: Float) {

    private val pi: Float = 3.14F

    fun getAreaOfCircle() {
        val areaOfCircle = pi * radius * radius
        println("Площадь круга: ${"%.2f".format(areaOfCircle)}")
    }

    fun getLengthOfCircle() {
        val lengthOfCircle = 2 * pi * radius
        println("Длина круга: ${"%.2f".format(lengthOfCircle)}")
    }

}