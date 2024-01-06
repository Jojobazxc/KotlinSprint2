package lesson18.task5

fun main() {

    val screen = Screen()

    screen.draw(Point(1, 2))
    screen.draw(Circle(Point(5, 4), 3))
    screen.draw(Square(Point(7, 8), 5))

}

class Point(var x: Int, var y: Int)
class Circle(var center: Point, var radius: Int)
class Square(var startPoint: Point, var lengthOfSide: Int)

class Screen {

    fun draw(point: Point) {
        println("Нарисована точка с координатами: [${point.x};${point.y}]")
    }

    fun draw(circle: Circle) {
        println("Нарисован круг с центром в точке [${circle.center.x};${circle.center.y}] и радиусом: ${circle.radius} см.")
    }

    fun draw(square: Square) {
        println("Нарисован квадрат с координатами начала: [${square.startPoint.x};${square.startPoint.y}] и длиной стороны ${square.lengthOfSide}")
    }
}