package lesson13.task3

fun main() {
    val contact1 = Phonebook3("Александр", 88005553535, null)
    val contact2 = Phonebook3("Иван", 88005553536, null)
    val contact3 = Phonebook3("Дмитрий", 88005553537, "null")
    val contact4 = Phonebook3("Сергей", 88005553538, "Microsoft")
    val contact5 = Phonebook3("Анатолий", 88005553539, "Apple")

    val listOfContacts = listOf(contact1, contact2, contact3, contact4, contact5)
    val listOfCompanies: MutableList<String> = mutableListOf()

    listOfContacts.forEach { company -> company.company?.let { listOfCompanies.add(it) } }

    println("Список компаний, которые есть в телефонной книжке: ")
    listOfCompanies.forEach { println(it) }

}