package lesson18.task3

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