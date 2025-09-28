fun main() {
    val trainLeftTimeHours = 9
    val trainLeftTimeMinutes = 39
    val travelTimeMinutes = 457
    val travelTimeHours = travelTimeMinutes / MIN_IN_HOUR
    val travelTimeHoursRemain = travelTimeMinutes % MIN_IN_HOUR
    val travelTimeEndHours = (trainLeftTimeMinutes + travelTimeHoursRemain) / MIN_IN_HOUR
    val travelTimeEndMinutes = (trainLeftTimeMinutes + travelTimeHoursRemain) % MIN_IN_HOUR
    print(trainLeftTimeHours + travelTimeHours + travelTimeEndHours)
    print(':')
    print(travelTimeEndMinutes)
}

const val MIN_IN_HOUR = 60