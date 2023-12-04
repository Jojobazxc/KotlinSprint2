package lesson15.task3

fun main() {

    val user1 = DefaultUser("Александр")
    val user2 = DefaultUser("Иван")

    val admin = Admin("Петр")

    user1.readForum()
    user2.writeOnForum()
    admin.readForum()
    admin.removeMessge(user2)
    admin.removeUser(user2)

}