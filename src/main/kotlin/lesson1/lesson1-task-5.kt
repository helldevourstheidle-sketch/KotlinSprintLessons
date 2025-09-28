fun main() {
    val secInSpace: Short = 6480
    val minInSpace = secInSpace / secInMin
    val hourInSpace = minInSpace / minInHour
    val ostMinInSpace = secInSpace % secInMin
    val ostHourInSpace = minInSpace % minInHour
    val timeInSpaceToPrint = String.format("%s$hourInSpace:$ostHourInSpace:%s$ostMinInSpace", "0", "0")
    println(timeInSpaceToPrint)
}

const val minInHour = 60
const val secInMin = 60
