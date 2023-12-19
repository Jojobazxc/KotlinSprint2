package lesson19.task5

fun main() {

    val listOfPeople: MutableList<Human> = mutableListOf()

    var name: String
    var gender: String
    var human: Human

    for (i in 1..5){
        println("Введите имя с большой буквы, затем пол человек. Доступны: Мужской, Женский и \"Не указан\"")
        name = readln()
        gender = readln()
        when(gender){
            "Мужской" -> getGender(Gender.MALE)
            "Женский" -> getGender(Gender.FEMALE)
            "Не указан" -> getGender(Gender.UNSPECIFIED)
        }
        human = Human(name, gender)
        listOfPeople.add(human)
    }
    listOfPeople.forEach { println("${it.name}, ${it.gender}") }
}

class Human(val name: String, val gender: String)

enum class Gender(val translate: String){
    MALE("Мужской"),
    FEMALE("Женский"),
    UNSPECIFIED("Не указан"),
}

fun getGender(gender: Gender): String{
    return when(gender){
        Gender.MALE -> Gender.MALE.translate
        Gender.FEMALE -> Gender.FEMALE.translate
        Gender.UNSPECIFIED -> Gender.UNSPECIFIED.translate
    }
}

