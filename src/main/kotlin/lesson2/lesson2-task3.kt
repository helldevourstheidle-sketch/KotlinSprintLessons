fun main() {
    val trainLeftTimeHours = 9
    val trainLeftTimeMinutes = 39
    val travelTimeMinutes = 457
    val travelTimeHours = travelTimeMinutes / 60
    val travelTimeHoursRemain = travelTimeMinutes % 60
    val travelTimeEndHours = (trainLeftTimeMinutes + travelTimeHoursRemain) / 60
    val travelTimeEndMinutes = (trainLeftTimeMinutes + travelTimeHoursRemain) % 60
    print(trainLeftTimeHours + travelTimeHours + travelTimeEndHours)
    print(':')
    print(travelTimeEndMinutes)
}