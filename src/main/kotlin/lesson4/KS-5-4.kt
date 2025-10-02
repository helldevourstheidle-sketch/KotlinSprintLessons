fun main() {
    println("Наличие повреждений корпуса true/false?")
    val hasDamage = readLine().toBoolean()
    println("Текущий состав экипажа?")
    val crewCount = readln().toInt()
    println("Количество ящиков с провизией?")
    val provisionsCount = readln().toInt()
    println("Погода благоприятна true/false??")
    val isWeatherGood = readLine().toBoolean()
    println("Корабль может выходить в плавание?:${hasDamage == HAS_DAMAGE_FALSE && crewCount >= CREW_COUNT_55 && crewCount <= CREW_COUNT_70 && provisionsCount > PROVISION_COUNT_50 && isWeatherGood == IS_WEATHER_GOOD_TRUE || crewCount > CREW_COUNT_70 && isWeatherGood == IS_WEATHER_GOOD_TRUE && provisionsCount > PROVISION_COUNT_50}")
}

const val HAS_DAMAGE_FALSE = false
const val CREW_COUNT_55 = 55
const val CREW_COUNT_70 = 70
const val PROVISION_COUNT_50 = 50
const val IS_WEATHER_GOOD_TRUE = true




