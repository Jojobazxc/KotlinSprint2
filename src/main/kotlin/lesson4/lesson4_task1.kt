package lesson4

fun main() {

    val tablesOnToday = TOTAL_TABLES
    val tablesOnTomorrow = TOTAL_TABLES - 4

    println("Доступность столиков на сегодня: ${tablesOnToday < TOTAL_TABLES}\nДоступность столиков на завтра: ${tablesOnTomorrow < TOTAL_TABLES}")

}

const val TOTAL_TABLES = 13