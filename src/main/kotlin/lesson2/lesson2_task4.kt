package lesson2

fun main(){

    val countOfIronOre: Short = 11
    val countOfCrystalOre: Short = 7

    println("Кол-во бонусного железа: ${(countOfIronOre * 0.2).toInt()}")
    println("Кол-во бонусной кристалической руды: ${(countOfCrystalOre * 0.2).toInt()}")

}