fun main() {
    val rightAnswer = 5
    println("Решите пример для подтверждения, что Вы не бот, введите ответ в консоль: 2+3=?")
    val userAnswer = readln().toInt()
    if (userAnswer == rightAnswer)
        println("Добро пожаловать!")
    else println("Доступ запрещен.")
}