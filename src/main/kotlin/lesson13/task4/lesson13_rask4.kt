package lesson13.task4

import java.util.*

fun main() {

    var stopWord: String
    val listOfContacts: MutableList<Phonebook4> = mutableListOf()
    var nameOfContact: String
    var phoneNumber: Long
    var company: String?

    do {
        println("Введите имя:")
        nameOfContact = readln()

        println("Введите номер:")
        phoneNumber = readln().toLongOrNull() ?: 0

        if (phoneNumber.toInt() != 0) {
            println("Введите компанию (можно пропустить):")
            company = readln()

            if (company == "") company = null
            val contact = Phonebook4(nameOfContact, phoneNumber, company)

            listOfContacts.add(contact)

        } else println("Вы не ввели номер телофона, попробуйте еще раз")

        print("Введите \"стоп\", что прекратить заполнение или \"продолжить\", чтобы продолжить заполнять: ")
        stopWord = readln().lowercase(Locale.getDefault())

    } while (stopWord != "стоп")

    println("Телефонная книга выглядит так:\n")
    listOfContacts.forEach { println("Имя:${it.name}\nНомер:${it.phoneNumber}\nКомпания: ${it.company} \n") }

}

class Phonebook4(val name: String, val phoneNumber: Long, var company: String?)