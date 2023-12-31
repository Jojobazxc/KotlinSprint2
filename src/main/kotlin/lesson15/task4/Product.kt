package lesson15.task4

abstract class Product : Searchable {

    abstract val name: String
    abstract val quantityOnStock: Int

}

class MusicalInstrument(
    override val name: String,
    override val quantityOnStock: Int
) : Product() {

    override fun startSearch(product: Product) {
        println("Выполняется поиск: ${product.name}")
    }
}

class Component(
    override val name: String,
    override val quantityOnStock: Int

) : Product() {
    override fun startSearch(product: Product) {
    }
}

interface Searchable {
    fun startSearch(product: Product)
}