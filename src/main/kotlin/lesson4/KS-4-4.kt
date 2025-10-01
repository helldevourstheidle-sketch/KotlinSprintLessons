fun main() {
    val trainDay = 5
    val workoutForArms = trainDay % 2 != 0
    val workoutForLegs = trainDay % 2 == 0
    val workoutForback = trainDay % 2 == 0
    val workoutforAbs = trainDay % 2 != 0
    println(
        """|Упражнения для рук:$workoutForArms
        |Упражнения для ног:$workoutForLegs
        |Упражнения для спины:$workoutForback
        |Упражнения для пресса:$workoutforAbs
    """.trimMargin()
    )
}