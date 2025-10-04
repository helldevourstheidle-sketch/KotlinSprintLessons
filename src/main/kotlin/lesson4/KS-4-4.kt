fun main() {
    val trainDay = 5 % 2

    println(
        """|Упражнения для рук:${trainDay != 0}
        |Упражнения для ног:${trainDay == 0}
        |Упражнения для спины:${trainDay == 0}
        |Упражнения для пресса:${trainDay != 0}
    """.trimMargin()
    )
}
