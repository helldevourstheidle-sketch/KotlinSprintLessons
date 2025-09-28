fun main() {
    val userStep = "D2-D4;0"
    val data1 = userStep.split('-', ';')
    val stepFrom = data1[0]
    val stepTo = data1[1]
    val stepNumber = data1[2]
    println(stepFrom)
    println(stepTo)
    println(stepNumber)
}