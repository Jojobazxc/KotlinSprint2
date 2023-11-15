package lesson2


fun main() {

    val countOfStudents = 4
    val sumOfGrades: Float = 3f + 4f + 3f + 5f

    val average: Float = (sumOfGrades / countOfStudents).toFloat()

    println("%.2f".format(average))

}