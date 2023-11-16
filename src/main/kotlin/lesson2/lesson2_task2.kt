package lesson2

fun main() {

    val employees: Short = 50
    val salaryOfEmployees: Int = 30000
    val trainee: Short = 30
    val salaryOfTrainee: Int = 20000

    val sumOfSalaryOfEmployees: Int = employees * salaryOfEmployees
    val sumOfSalary: Int = sumOfSalaryOfEmployees + (trainee * salaryOfTrainee)
    val averageOfSalary: Int = sumOfSalary / (employees + trainee)

    println("Расходы на выплату ЗП постоянным сотрудникам: $sumOfSalaryOfEmployees")
    println("Расходы на выплату ЗП: $sumOfSalary")
    println("Средняя ЗП одного сотрудника после устройства стажеров: $averageOfSalary")

}