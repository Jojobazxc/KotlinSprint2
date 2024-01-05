package lesson18.task4


fun main() {
    val rectangularBox = RectangularBox(5.0, 3.0, 2.0)
    val cubeBox = CubeBox(4.0)

    println("Площадь поверхности прямоугольной коробки: ${rectangularBox.calculateSurfaceArea()}")
    println("Площадь поверхности кубической коробки: ${cubeBox.calculateSurfaceArea()}")
}

open class Box {
    open fun calculateSurfaceArea(): Double {
        return 0.0
    }
}

class RectangularBox(val length: Double, val width: Double, val height: Double) : Box() {
    override fun calculateSurfaceArea(): Double {
        return 2 * (length * width + length * height + width * height)
    }
}

class CubeBox(val sideLength: Double) : Box() {
    override fun calculateSurfaceArea(): Double {
        return 6 * sideLength * sideLength
    }
}