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

class Duck(private val name: String) : Flying, Swimming {
    override fun canFly() {
        println("$name: может летать")
    }

    override fun canSwim() {
        println("$name: может плавать")
    }
}

class Carp(private val name: String) : Swimming {
    override fun canSwim() {
        println("$name: может плавать")
    }
}

class Gull(private val name: String) : Flying {
    override fun canFly() {
        println("$name: может летать")
    }
}

interface Flying {
    fun canFly()
}

interface Swimming {
    fun canSwim()
}