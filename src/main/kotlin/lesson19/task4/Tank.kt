package lesson19.task4

class Tank(private var typeOfPatrons: Patrons?) {

    fun armedANewPatrons(patrons: Patrons) {
        typeOfPatrons = patrons
        println("Перезарядка патронами вида: ${patrons.name}")
    }

    fun takeAShot(patrons: Patrons) {
        println("Произведен выстрел патронами вида: ${patrons.name}. Нанесен урон: ${patrons.damage} едениц")
    }


}