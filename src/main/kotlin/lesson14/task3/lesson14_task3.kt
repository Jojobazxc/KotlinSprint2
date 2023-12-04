package lesson14.task3

fun main() {

    val circle1 = Circle("black", 0.00, 4.00, 0.00)
    val rectangle1 = Rectangle("black", 0.00, 0.00, 10.00, 5.00)
    val circle2 = Circle("white", 0.00, 6.00, 0.00)
    val rectangle2 = Rectangle("white", 0.00, 0.00, 20.00, 10.00)

    val sumOfPerimeterBlack = circle1.getPerimeterOfTheFigure() + rectangle1.getPerimeterOfTheFigure()
    val sumOfTheAreaWhite = circle2.getAreaOfTheFigure() + rectangle2.getAreaOfTheFigure()

    println("Сумма периметров черных фигур: %.2f".format(sumOfPerimeterBlack))
    println("Сумма площадей белых фигур: %.2f".format(sumOfTheAreaWhite))
    
}