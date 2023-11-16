package lesson2

import kotlin.math.pow

fun main(){

    val initialAmount: Int = 70000
    val percentsOfDeposit: Double = 16.7
    val years: Int = 20

    val sumOfTheEnd: Double = initialAmount * ((1 + (percentsOfDeposit/100))).pow(years)

    println("%.3f".format(sumOfTheEnd))

}