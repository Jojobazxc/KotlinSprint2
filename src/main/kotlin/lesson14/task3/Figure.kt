package lesson14.task3

import kotlin.math.PI
import kotlin.math.pow

abstract class Figure(val color: String) {

    abstract fun getAreaOfTheFigure(): Double
    abstract fun getPerimeterOfTheFigure(): Double
}

class Circle(
    color: String,
    var area: Double,
    val radius: Double,
    var perimeter: Double
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
    var area: Double,
    var perimeter: Double,
    val weight: Double,
    val height: Double,
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