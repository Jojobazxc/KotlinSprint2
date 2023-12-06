package lesson17.task4

class Package(numberOfPackage: Int, currentGeo: String) {

    var countOfChange: Int = 0
    var currentGeo: String = currentGeo
        set(value) {
            field = value
            countOfChange++
        }
}