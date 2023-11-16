package lesson2

fun main() {

    val countOfIronOre: Short = 11
    val countOfCrystalOre: Short = 7
    var percents: Float = 20f

    percents /= 100

    val countOfIronOreBonus = countOfIronOre * percents
    val countOfCrystalOreBonus = countOfCrystalOre * percents

    println("Кол-во бонусного железа: ${countOfIronOreBonus.toInt()}")
    println("Кол-во бонусной кристалической руды: ${countOfCrystalOreBonus.toInt()}")

}