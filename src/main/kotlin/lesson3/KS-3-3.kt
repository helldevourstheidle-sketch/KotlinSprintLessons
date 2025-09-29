fun main() {
    val userNumber = 5
    val tabForUserNumber = """
        ${userNumber * 1}
        ${userNumber * 2}
        ${userNumber * 3}
        ${userNumber * 4}
        ${userNumber * 5}
        ${userNumber * 6}
        ${userNumber * 7}
        ${userNumber * 8}
        ${userNumber * 9}
    """.trimIndent()
    println(tabForUserNumber)
}