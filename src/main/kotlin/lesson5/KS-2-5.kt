fun main() {
    val yearOfBirth = YEAR_TODAY - readln().toInt()
    if (yearOfBirth >= AGE_OF_MAJORITY) {
        println("Show special content")
    } else {
        println("Back to main screen")
    }
}

const val AGE_OF_MAJORITY = 18
const val YEAR_TODAY = 2025
