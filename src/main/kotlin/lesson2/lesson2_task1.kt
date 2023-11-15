package lesson2

fun main(){

    val countOfStudents: Float = 4f
    val sumOfGrades: Float = 3f + 4f + 3f + 5f

    val average: Float = (sumOfGrades / countOfStudents)

    println("%.2f".format(average))

}