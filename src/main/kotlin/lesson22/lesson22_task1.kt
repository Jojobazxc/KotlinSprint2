package lesson22

fun main() {

    val regularBook = RegularBook("book1", "author")
    val regularBook2 = RegularBook("book1", "author")

    val dataBook = DataBook("book1", "author")
    val dataBook2 = DataBook("book1", "author")

    println(regularBook == regularBook2)
    println(dataBook == dataBook2)

}

class RegularBook(val name: String, val author: String)

data class DataBook(val name: String, val author: String)

// в первом случае выводится false, потому что при сравнении обычных классов сравниваются ссылки на объекты
// во втором случае выведется false , потому что data класс позволяется сравнить проинициализированные данные