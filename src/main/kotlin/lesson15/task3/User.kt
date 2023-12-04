package lesson15.task3

abstract class User {
    abstract val name: String
    abstract val canRead: Boolean
    abstract val canWrite: Boolean
    abstract val canRemoveMessages: Boolean
    abstract val canRemoveUsers: Boolean

    abstract fun readForum()
    abstract fun writeOnForum()
}

class DefaultUser(
    override val name: String,
    override val canWrite: Boolean = true,
    override val canRead: Boolean = true,
    override val canRemoveUsers: Boolean = false,
    override val canRemoveMessages: Boolean = false,
): User(){
    override fun readForum() {
        println("Пользователь $name читает форум")
    }

    override fun writeOnForum() {
        println("Пользователь $name пишет...")
    }
}

class Admin(
    override val name: String,
    override val canWrite: Boolean = true,
    override val canRead: Boolean = true,
    override val canRemoveUsers: Boolean = true,
    override val canRemoveMessages: Boolean = true,
): User(){
    override fun readForum() {
        println("Администратор $name читает форум")
    }

    override fun writeOnForum() {
        println("Администратор $name печатает...")
    }

    fun removeMessge(defaultUser: DefaultUser){
        println("Администратор $name удалил сообщение пользователя ${defaultUser.name}")
    }
    fun removeUser(defaultUser: DefaultUser){
        println("Администратор удалил пользователя ${defaultUser.name}")
    }

}