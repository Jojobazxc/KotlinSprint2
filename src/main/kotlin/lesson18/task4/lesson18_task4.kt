package lesson18.task4


fun main() {
    val rectangularBox = RectangularBox(5.0, 3.0, 2.0)
    val cubeBox = CubeBox(4.0)

    println("Площадь поверхности прямоугольной коробки: ${rectangularBox.calculateSurfaceArea()}")
    println("Площадь поверхности кубической коробки: ${cubeBox.calculateSurfaceArea()}")
}