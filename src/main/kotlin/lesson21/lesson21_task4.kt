package lesson21

import java.io.File
import java.util.*

fun main() {

    println("Введите текст: ")
    val file = File("textFile.txt")
    file.writeTextToFile()

}

fun File.writeTextToFile() {

    val text = readln().lowercase(Locale.getDefault())
    createNewFile()
    writeText(text)

}