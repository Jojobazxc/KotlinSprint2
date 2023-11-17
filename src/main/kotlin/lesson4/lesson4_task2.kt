package lesson4

fun main() {

    val averageMass = 35..100
    val averageVolume = 0..<100

    val firstCargoMass = 20
    val firstCargoVolume = 80
    val secondCargoMass = 50
    val secondCargoVolume = 100

    println("Груз с весом $firstCargoMass кг и объемом $firstCargoVolume л соответствует категории 'Average': ${(firstCargoMass in averageMass) && (firstCargoVolume in averageVolume)}")
    println("Груз с весом $secondCargoMass кг и объемом $secondCargoVolume л соответствует категории 'Average': ${(secondCargoMass in averageMass) && (secondCargoVolume in averageVolume)}")

}

