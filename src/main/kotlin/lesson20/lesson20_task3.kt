package lesson20

class Player1(val hasAKey: Boolean)

fun main() {

    val player1 = Player1(false);

    { player: Player1 -> if (player.hasAKey == false) println("Дверь заперта") else println("Дверь открыта") }(player1)

}