fun main() {
    val bookedTablesToday = 13
    val bookedTablesTomorrow = 9
    println("Доступность столиков на сегодня:${bookedTablesToday < TABLE_COUNT}\nДоступность столиков на завтра:${bookedTablesTomorrow < TABLE_COUNT}")
}

const val TABLE_COUNT = 13