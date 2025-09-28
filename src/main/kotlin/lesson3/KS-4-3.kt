fun main() {
    var stepNumber = 1
    var stepFrom = "E2"
    var stepTo = "E4"
    var stepBlack = stepFrom + '-' + stepTo + ';' + stepNumber
    println(stepBlack)
    stepNumber = 2
    stepFrom = "D2"
    stepTo = "D3"
    var stepWhite = stepFrom + '-' + stepTo + ';' + stepNumber
    println(stepWhite)
}