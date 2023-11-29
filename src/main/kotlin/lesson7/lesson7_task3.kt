package lesson7

fun main() {

    print("Введите число: ")
    val userNumber = readln().toInt()

    for (i in 0..userNumber step 2){
        print("$i ")
    }

}