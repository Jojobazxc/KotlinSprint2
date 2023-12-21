package lesson14.task3

import kotlin.math.PI
import kotlin.math.pow

fun main() {

    val circle1 = Circle(BLACK_COLOR, 0.00, 5.00, 0.00)
    val rectangle1 = Rectangle(BLACK_COLOR, 0.00, 0.00, 10.00, 5.00)
    val circle2 = Circle(WHITE_COLOR, 0.00, 6.00, 0.00)
    val rectangle2 = Rectangle(WHITE_COLOR, 0.00, 0.00, 20.00, 10.00)

    val figures = listOf(circle1, circle2, rectangle1, rectangle2)

    val sumOfPerimeterBlack = figures.filter { it.color == BLACK_COLOR }.sumOf { it.getPerimeterOfTheFigure() }
    val sumOfTheAreaWhite = figures.filter { it.color == WHITE_COLOR }.sumOf { it.getAreaOfTheFigure() }

    println("Сумма периметров черных фигур: %.2f".format(sumOfPerimeterBlack))
    println("Сумма площадей белых фигур: %.2f".format(sumOfTheAreaWhite))

}

abstract class Figure(val color: String) {

    abstract fun getAreaOfTheFigure(): Double
    abstract fun getPerimeterOfTheFigure(): Double
}

class Circle(
    color: String,
    private var area: Double,
    private val radius: Double,
    private var perimeter: Double
) : Figure(color) {
    override fun getAreaOfTheFigure(): Double {
        area = PI * (radius.pow(2))
        return area
    }

    override fun getPerimeterOfTheFigure(): Double {
        perimeter = 2 * PI * radius
        return perimeter
    }
}

class Rectangle(
    color: String,
    private var area: Double,
    private var perimeter: Double,
    private val weight: Double,
    private val height: Double,
) : Figure(color) {
    override fun getAreaOfTheFigure(): Double {
        area = weight * height
        return area
    }

    override fun getPerimeterOfTheFigure(): Double {
        perimeter = 2 * (weight * height)
        return perimeter
    }
}


const val WHITE_COLOR = "белый"
const val BLACK_COLOR = "черный"