package lesson3

fun main() {

    val number = 5
    val table = """
        $number * 1 = ${number * 1}
        $number * 2 = ${number * 2}
        $number * 3 = ${number * 3}
        $number * 4 = ${number * 4}
        $number * 5 = ${number * 5}
        $number * 6 = ${number * 6}
        $number * 7 = ${number * 7}
        $number * 8 = ${number * 8}
        $number * 9 = ${number * 9}
        $number * 10 = ${number * 10}
    """.trimIndent()

    println(table)

}