package lesson17.task3

class Folder(name: String, quantityOfFiles: Int, var isPrivate: Boolean = false) {

    var name: String = name
        get() = if (isPrivate) "Скрытая папка" else field
    var quantityOfFiles: Int = quantityOfFiles
        get() = if (isPrivate) 0 else field


}