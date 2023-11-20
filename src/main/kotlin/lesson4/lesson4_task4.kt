package lesson4

fun main() {

    val numberOfDay = 5
    val evenDay = (numberOfDay % 2 == 0)

    println("""
        Упражнения для рук: ${!evenDay}
        Упражнения для ног: $evenDay
        Упражнения для спины: $evenDay
        Упражнения для пресса: ${!evenDay}
    """.trimIndent())

}