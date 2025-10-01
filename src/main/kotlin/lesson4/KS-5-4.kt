fun main() {
    println("Наличие повреждений корпуса true/false?")
    val hasDamage = readLine().toBoolean()
    println("Текущий состав экипажа?")
    val crewCount = readln().toInt()
    println("Количество ящиков с провизией?")
    val provisionsCount = readln().toInt()
    println("Погода благоприятна true/false??")
    val isWeatherGood = readLine().toBoolean()
    println("Корабль может выходить в плавание?:${hasDamage == false && crewCount >= 55 && crewCount <= 70 && provisionsCount > 50 && isWeatherGood == true || crewCount > 70 && isWeatherGood == true && provisionsCount > 50}")
}