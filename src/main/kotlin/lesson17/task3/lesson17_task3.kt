package lesson17.task3

fun main() {
    val folder1 = Folder("folder", 15, true)
    println("Name: ${folder1.name}")
    println("Quantity of files: ${folder1.quantityOfFiles}")
}

class Folder(name: String, quantityOfFiles: Int, var isPrivate: Boolean = false) {

    var name: String = name
        get() = if (isPrivate) "Скрытая папка" else field
    var quantityOfFiles: Int = quantityOfFiles
        get() = if (isPrivate) 0 else field

}