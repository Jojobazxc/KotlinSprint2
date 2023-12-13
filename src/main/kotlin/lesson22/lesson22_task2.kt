package lesson22

fun main() {

    val regularBook = RegularBook2("book1", "author")
    val dataBook = DataBook2("book1", "author")

    println(regularBook)
    println(dataBook)

}

class RegularBook2(val name: String, val author: String)

data class DataBook2(val name: String, val author: String)

//опять же в первом случае выводится ссылка на объект, потому что это экземпляр обычного класса
//во втором же случае выводится строка со свойствами, потому что это экземпляр data класса