package lesson16.task5

fun main() {

    val player = Player("Игрок", 100, 25)

    player.getDamage(20) // получение урона
    player.getHealth(10)    // лечение
    println()
    player.getDamage(100) // получение смертельного урона
    println()
    player.getDamage(20) // попытка получить урон после смерти
    println()
    player.getHealth(10) // попытка вылечиться после смерти

}

class Player(
    private val name: String,
    private var health: Int,
    private var powerOfHit: Int,
) {
    private var isDead: Boolean = false

    private fun die() {
        isDead = true
        health = 0
        powerOfHit = 0
        println("$name умер")
    }

    fun getHealth(heal: Int) {
        if (!isDead) {
            health += heal
            println("Здоровье игрока восполнено на $heal единиц ")
            println("Текущее здоровье: $health")
        } else println("Игрок уже мертв")
    }

    fun getDamage(damage: Int) {
        if (!isDead) {
            health -= damage
            if (health <= 0) {
                println("Получен урон в размере $damage едениц")
                die()
            } else {
                println("Игрок получил урон в размере $damage единиц")
                println("Текущее здоровье: $health")
            }
        } else println("Игрок уже умер")
    }

}