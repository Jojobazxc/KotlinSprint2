package lesson21

fun main() {

    val mapOfSkills = mapOf<String, Int>(
        "Сила" to 100,
        "Лечение" to 30,
        "Выносливость" to 100,
        "Ловкость" to 60,
        "Интеллект" to 100,

        )
    val maxCategory = mapOfSkills.maxCategory()
    println(maxCategory)
}

fun Map<String, Int>.maxCategory(): String? {

    if (isEmpty()) return null

    val maxCategory = entries.maxByOrNull { it.value }
    val maxEntries = entries.filter { it.value == maxCategory?.value }

    return maxEntries.randomOrNull()?.key

}

