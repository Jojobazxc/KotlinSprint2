package lesson21

fun main() {

    val player = Player("Vanya", 53, 100)
    val isHealthy = player.isHealthy(player)
    println("У игрока ${player.name} полная шкала здоровья: $isHealthy")

}

class Player(val name: String, val currentHealth: Int, val maxHealth: Int)

fun Player.isHealthy(player: Player): Boolean{

    return player.currentHealth == player.maxHealth

}