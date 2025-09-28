fun main() {
    val defaultSumm = 70000.0
    val term = 20.0
    val interestRate = 16.7
    val endSumm = defaultSumm * Math.pow(1 + interestRate / 100, term)
    val endSummAfter = String.format("%.3f", endSumm)
    println(endSummAfter)
}
