fun main() {
    val secInSpace: Short = 6480
    val minInSpace = secInSpace / 60
    val hourInSpace = minInSpace / 60
    val ostMinInSpace = secInSpace % 60
    val ostHourInSpace = minInSpace % 60
    println("0$hourInSpace:$ostHourInSpace:0$ostMinInSpace")
}