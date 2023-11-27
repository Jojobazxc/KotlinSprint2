package lesson8

import kotlin.random.Random
import kotlin.random.nextInt

fun main() {

    val arrayOfViews = IntArray(DAY_IN_WEEK)
    var sumOfViews = 0
    val rangeForRandom = 1000..10000

    for(i in arrayOfViews){
        arrayOfViews[i] = Random.nextInt(rangeForRandom)
        sumOfViews += arrayOfViews[i]
    }

    println("Сумма просмотров за неделю: $sumOfViews")

}

const val DAY_IN_WEEK = 7