package lesson11.task3

fun main() {

    val user1 = User1(
        avatar = "1.jpg",
        nickname = "Первый",
        statusOfSpeaking = "разговаривает"
    )
    val user2 = User1(
        avatar = "2.jpg",
        nickname = "Второй",
        statusOfSpeaking = "микрофон выключен"
    )
    val user3 = User1(
        avatar = "3.jpg",
        nickname = "Третий",
        statusOfSpeaking = "пользователь заглушен"
    )
    val user4 = User1(
        avatar = "4.jpg",
        nickname = "Четвёртый",
        statusOfSpeaking = "разговаривает"
    )
    val user5 = User1(
        avatar = "5.jpg",
        nickname = "Пятый",
        statusOfSpeaking = "пользователь заглушен"
    )

    val userList1: List<User1> = listOf(user1, user2, user3)
    val userList2: List<User1> = listOf(user4, user5)

    val room1 = Room(
        cover = "room1.jpg",
        nameOfRoom = "Первая комната",
        userList = userList1
    )
    val room2 = Room(
        cover = "room2.jpg",
        nameOfRoom = "Вторая комната",
        userList = userList2
    )

    val roomList: List<Room> = listOf(room1, room2)
    getListOfRoom(roomList)

    println("В какую комнату вы хотите зайти?")
    val selectRoom: Int = readln().toInt() - 1
    roomList[selectRoom].getRoomInfo(selectRoom, roomList)

    println("На какого пользователя хотите нажать?")
    val selectUser: Int = readln().toInt() - 1
    roomList[selectRoom].getUserInfo(selectUser)

}

fun getListOfRoom(roomList: List<Room>) {

    roomList.forEach { room ->
        println("Название комнаты: ${room.nameOfRoom}")
    }

}