package lesson11.task3

class User1(
    val avatar: String,
    val nickname: String,
    val statusOfSpeaking: String,
)

class Room(
    val cover: String,
    val nameOfRoom: String,
    val userList: List<User1>
) {

    fun getRoomInfo(selectRoom: Int, roomList: List<Room>) {
        println("Название комнаты: ${roomList[selectRoom].nameOfRoom}")
        println("Обложка комнаты: ${roomList[selectRoom].cover}")
        roomList[selectRoom].userList.forEach { user ->
            println("Аватар: ${user.avatar} | Статус: ${user.statusOfSpeaking}")
        }
    }

    fun getUserInfo(selectUser: Int) {
        println(userList[selectUser].nickname)
    }

}
