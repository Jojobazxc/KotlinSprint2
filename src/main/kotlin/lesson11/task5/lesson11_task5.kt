package lesson11.task5

fun main() {
    val forum = Forum()
    val user1 = forum.createNewUser("Александр")
    val user2 = forum.createNewUser("Пётр")

    forum.createNewMessage(user1.userId, "Здравствуйте, это моё первое сообщение")
    forum.createNewMessage(user2.userId, "Здравствуйте, моё тоже")
    forum.createNewMessage(user1.userId, "Замечательно")
    forum.createNewMessage(user2.userId, "Согласен")

    forum.printForum()
}