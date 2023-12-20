package lesson22

import java.time.LocalDateTime
import java.util.Date
import java.util.Locale


fun main() {

    val galacticGuide = GalacticGuide(
        "Alpha Centauri",
        "A star system, and is widely believed to be the closest to the solar system",
        dateOfEvent = LocalDateTime.now(),
        4.367F
    )

    println("Description: ${galacticGuide.component2()}")

}

data class GalacticGuide(
    val nameOfPlaceOrEvent: String,
    val descriptionOfPlaceOrEvent: String,
    val dateOfEvent: LocalDateTime,
    val distanceOfPlaceOrEvent: Float,
)