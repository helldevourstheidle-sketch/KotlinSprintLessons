fun main() {
    val trainDay = 5

    println(
        """|Упражнения для рук:${trainDay % 2 != 0}
        |Упражнения для ног:${trainDay % 2 == 0}
        |Упражнения для спины:${trainDay % 2 == 0}
        |Упражнения для пресса:${trainDay % 2 != 0}
    """.trimMargin()
    )
}