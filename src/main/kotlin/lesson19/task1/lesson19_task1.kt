package lesson19.task1

fun main() {

    val listOfNames = listOf("гуппи", "золотая рыбка", "рыбка-петушок", "скалярия")

    for (i in listOfNames) {
        when (i) {
            "гуппи" -> addFishes(Fishes.GUPPY)
            "золотая рыбка" -> addFishes(Fishes.GOLDFISH)
            "рыбка-петушок" -> addFishes(Fishes.SIAMESE_FIGHTING_FISH)
            "скалярия" -> addFishes(Fishes.ANGELFISH)
        }
    }

}

enum class Fishes {
    GUPPY,
    GOLDFISH,
    SIAMESE_FIGHTING_FISH,
    ANGELFISH
}

fun addFishes(fishes: Fishes) {
    when (fishes) {
        Fishes.GUPPY -> println("Вы можете добавить рыбку гуппи")
        Fishes.GOLDFISH -> println("Вы можете добавить золотую рыбку")
        Fishes.SIAMESE_FIGHTING_FISH -> println("Вы можете добавить рыбку-петушка")
        Fishes.ANGELFISH -> println("Вы можете добавить скалярию")
    }
}