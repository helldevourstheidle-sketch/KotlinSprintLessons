fun main() {
    val isSunny = true
    val openAwning = true
    val humidity = 20
    val season = "не зима"
    val weatherToday = true
    val awningIsOpenToday = true
    val airHumidityToday = 20
    val currentTimeOfTheYear = "зима"
    println("Благоприятные ли условия сейчас для роста бобовых?" + "${isSunny == weatherToday && openAwning == awningIsOpenToday && humidity == airHumidityToday && season == currentTimeOfTheYear}")
}