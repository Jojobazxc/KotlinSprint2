package lesson19.task2

class Product(val name: String, val id: Int, val categories: String) {

    fun getInfoAboutProduct(){
        println("Название товара: $name")
        println("Id товара: $id")
        println("Категория: $categories")
    }

}