package lesson20

fun main() {

    val player1 = Player("Vanya", 53)

    val heelingSalve =
        { player: Player -> "Текущее здоровье игрока ${player.name} восполнено с ${player.currentHealth} до ${player.maxHealth}" }

    println(heelingSalve(player1))

}

class Player(val name: String, val currentHealth: Int, val maxHealth: Int = 100)