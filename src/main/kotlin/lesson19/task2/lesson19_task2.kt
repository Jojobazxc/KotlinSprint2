package lesson19.task2

fun main() {

    val dress = Product("платье", 1, getCategory(Categories.CLOTHES))
    val pen = Product("ручка", 2, getCategory(Categories.STATIONERY))

    dress.getInfoAboutProduct()
    println()
    pen.getInfoAboutProduct()

}


enum class Categories {
    CLOTHES,
    STATIONERY,
    DIFFERENT,
}

fun getCategory(categories: Categories): String{

    return when(categories){
        Categories.CLOTHES -> "Одежда"
        Categories.STATIONERY -> "Канцтовары"
        Categories.DIFFERENT -> "Разное"
    }

}