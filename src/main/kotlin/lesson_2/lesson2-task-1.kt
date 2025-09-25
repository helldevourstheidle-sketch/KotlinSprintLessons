package org.example.lesson_2

fun main() {
    var ordersCount:Int=75 //var - т.к переменную с кол-вом заказов подразумеваю как динамическую
    val msgAfterOrder:String="Thx for order, waiting you again..." //val - т.к. текст будет статикой и меняться не будет, только вопрос как это отразится на локализации ... В момент потребности в переводах может ли это стать проблемой ?
println(ordersCount)
    println(msgAfterOrder) //вывел в консоль для перепроверки
}