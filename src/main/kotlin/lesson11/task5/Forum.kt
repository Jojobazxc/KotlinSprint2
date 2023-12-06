package lesson11.task5

class ForumMember(val userId: Int, val userName: String)

class ForumMessage(val authorId: Int, val message: String)

class Forum {
    private val members = mutableListOf<ForumMember>()
    private val messages = mutableListOf<ForumMessage>()


    fun createNewUser(userName: String = readln()): ForumMember {
        val newUserId = members.size + 1
        val newMember = ForumMember(newUserId, userName)
        members.add(newMember)
        return newMember
    }

    fun createNewMessage(authorId: Int, message: String) {
        if (members.any { it.userId == authorId }) {
            val newMessage = ForumMessage(authorId, message)
            messages.add(newMessage)
        } else {
            println("Ошибка: пользователь с id $authorId не найден")
        }
    }

    fun printForum() {
        messages.forEach { message ->
            val author = members.find { it.userId == message.authorId }
            println("${author?.userName}: ${message.message}")

        }
    }
}

