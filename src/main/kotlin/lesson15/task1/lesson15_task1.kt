package lesson15.task1

fun main() {

    val duck = Duck("Утка")
    duck.canFly()
    duck.canSwim()

    val carp = Carp("Карась")
    carp.canSwim()

    val gull = Gull("Чайка")
    gull.canFly()

}

abstract class Animal : Flying, Swimming {
    abstract val name: String
}

class Duck(
    override val name: String
) : Animal() {
    override fun canFly() {
        println("$name: может летать")
    }

    override fun canSwim() {
        println("$name: может плавать")
    }
}

class Carp(
    override val name: String
) : Animal() {
    override fun canSwim() {
        println("$name: может плавать")
    }

    override fun canFly() {
    }
}

class Gull(
    override val name: String
) : Animal() {
    override fun canFly() {
        println("$name: может летать")
    }

    override fun canSwim() {
    }
}

interface Flying {
    fun canFly()
}

interface Swimming {
    fun canSwim()
}