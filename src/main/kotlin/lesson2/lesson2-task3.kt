fun main() {
    val trainLeftTimeHours = 9
    val trainLeftTimeMinutes = 39
    val travelTimeMinutes = 457
    val travelTimeHours = travelTimeMinutes / minInHour
    val travelTimeHoursRemain = travelTimeMinutes % minInHour
    val travelTimeEndHours = (trainLeftTimeMinutes + travelTimeHoursRemain) / 60
    val travelTimeEndMinutes = (trainLeftTimeMinutes + travelTimeHoursRemain) % 60
    print(trainLeftTimeHours + travelTimeHours + travelTimeEndHours)
    print(':')
    print(travelTimeEndMinutes)
}

const val minInHour = 60