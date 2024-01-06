package lesson18.task3

fun main() {

    val fox: Tamagotchi = Fox()
    val dog: Tamagotchi = Dog()
    val cat: Tamagotchi = Cat()
    fox.getPlay()
    fox.getEat()
    fox.getSleep()
    println()
    dog.getPlay()
    dog.getEat()
    dog.getSleep()
    println()
    cat.getPlay()
    cat.getEat()
    cat.getSleep()

}

open class Tamagotchi {

    open val name: String = ""
    open fun getPlay() {
        println("$name - играет")
    }

    open fun getSleep() {
        println("$name - спит")
    }

    open fun getEat() {}
}

class Fox : Tamagotchi() {
    override val name: String = "Лиса"
    override fun getPlay() {
        super.getPlay()
    }

    override fun getSleep() {
        super.getSleep()
    }

    override fun getEat() {
        println("$name - ест ягоды")
    }

}

class Dog : Tamagotchi() {
    override val name: String = "Собака"

    override fun getPlay() {
        super.getPlay()
    }

    override fun getSleep() {
        super.getSleep()
    }

    override fun getEat() {
        println("$name - ест кости")
    }

}

class Cat : Tamagotchi() {
    override val name: String = "Кошка"
    override fun getPlay() {
        super.getPlay()
    }

    override fun getSleep() {
        super.getSleep()
    }

    override fun getEat() {
        println("$name - ест рыбу")
    }

}
