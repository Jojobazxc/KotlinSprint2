package lesson18.task4


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