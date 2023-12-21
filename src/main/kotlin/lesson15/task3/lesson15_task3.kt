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

abstract class User {
    abstract val name: String

    abstract fun readForum()
    abstract fun writeOnForum()
}

class DefaultUser(
    override val name: String,
) : User() {
    override fun readForum() {
        println("Пользователь $name читает форум")
    }

    override fun writeOnForum() {
        println("Пользователь $name пишет...")
    }
}

class Admin(
    override val name: String,
) : User() {
    override fun readForum() {
        println("Администратор $name читает форум")
    }

    override fun writeOnForum() {
        println("Администратор $name печатает...")
    }

    fun removeMessge(defaultUser: DefaultUser) {
        println("Администратор $name удалил сообщение пользователя ${defaultUser.name}")
    }

    fun removeUser(defaultUser: DefaultUser) {
        println("Администратор удалил пользователя ${defaultUser.name}")
    }
}