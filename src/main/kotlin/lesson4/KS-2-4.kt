fun main() {
    val weight1 = 20
    val weight2 = 50
    val volume1 = 80
    val volume2 = 100
    println("Груз с весом $weight1 кг и объемом $volume1 л  соответствует категории 'Average': " + "${weight1 > 35 && weight1 <= 100 && volume1 < 100}")
    println("Груз с весом $weight2 кг и объемом $volume2 л  соответствует категории 'Average': " + "${weight2 > 35 && weight2 <= 100 && volume2 < 100}")

}
