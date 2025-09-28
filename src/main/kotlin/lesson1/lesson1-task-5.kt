fun main() {
    val secInSpace: Short = 6480
    val minInSpace = secInSpace / SEC_IN_MIN
    val hourInSpace = minInSpace / MIN_IN_HOUR
    val ostMinInSpace = secInSpace % SEC_IN_MIN
    val ostHourInSpace = minInSpace % MIN_IN_HOUR
    println("%02d:%02d:%02d".format(hourInSpace, ostHourInSpace, ostMinInSpace))
}

const val MIN_IN_HOUR = 60
const val SEC_IN_MIN = 60
