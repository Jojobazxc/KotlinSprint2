package lesson19.task5

fun main() {

    val listOfPeople: MutableList<Human> = mutableListOf()

    var name: String
    var genderForReadLine: String
    var human: Human
    var gender: Gender = Gender.UNSPECIFIED


    for (i in 1..5) {
        println("Введите имя с большой буквы, затем пол человек. Доступны: Мужской, Женский и \"Не указан\"")
        name = readln()
        genderForReadLine = readln()
        when (genderForReadLine) {
            "Мужской" -> gender = Gender.MALE
            "Женский" -> gender = Gender.FEMALE
            "Не указан" -> gender = Gender.UNSPECIFIED
        }
        human = Human(name, gender)
        listOfPeople.add(human)
    }
    listOfPeople.forEach { println("${it.name}, ${it.gender.translate}") }
}

class Human(val name: String, val gender: Gender)

enum class Gender(val translate: String) {
    MALE("Мужской"),
    FEMALE("Женский"),
    UNSPECIFIED("Не указан"),
}



