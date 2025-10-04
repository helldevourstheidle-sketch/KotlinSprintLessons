fun main() {
    val variable1 = 2
    val variable2 = 3
    val rightAnswer = variable1 + variable2
    println("Решите пример для подтверждения, что Вы не бот, введите ответ в консоль: $variable1+$variable2=?")
    val userAnswer = readln().toInt()
    if (userAnswer == rightAnswer)
        println("Добро пожаловать!")
    else println("Доступ запрещен.")

}