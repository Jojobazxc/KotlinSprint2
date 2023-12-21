package lesson14.task5

fun main() {

    val message = Chat()
    message.addMessage("Всем привет!", "Родион")
    message.addThreadMessage("И тебе привет!", "Иван", 1)
    message.addMessage("Как у всех дела?", "Иван")
    message.addThreadMessage("Отлично!", "Дима", 3)
    message.printChat()

}

open class Chat() {

    private val listOfMessages = mutableListOf<Message>()

    fun addMessage(textOfMessage: String, authorOfMessage: String) {
        val message = Message(textOfMessage,authorOfMessage, listOfMessages.size + 1)
        listOfMessages.add(message)
    }

    fun addThreadMessage(textOfMessage: String, authorOfMessage: String, parentMessageId: Int) {
        val threadMessage = ChildMessage(textOfMessage, authorOfMessage, listOfMessages.size + 1, parentMessageId)
        listOfMessages.add(threadMessage)
    }

    fun printChat() {
        val groupedMessage = listOfMessages.groupBy { if (it is ChildMessage) it.parentMessageId else it.id}
        for (i in groupedMessage.keys.sorted()){
            for (message in groupedMessage.getValue(i)){
                if (message is ChildMessage) println("\t ${message.authorOfMessage}: ${message.textOfMessage}")
                else println("${message.authorOfMessage}: ${message.textOfMessage}")
            }
        }
    }

}

open class Message(
    val textOfMessage: String,
    val authorOfMessage: String,
    val id: Int,
)

class ChildMessage(
    textOfMessage: String,
    authorOfMessage: String,
    id: Int,
    val parentMessageId: Int,
): Message(textOfMessage, authorOfMessage, id)