fun main() {
    val baseSalary = 30000
    val salaryIntern = 20000
    val employees = 50
    val interns = 30
    val salaryEmployees = employees * baseSalary
    val generalSalary = (employees * baseSalary) + (interns * salaryIntern)
    val averageSalary = generalSalary / (employees + interns)
    println(salaryEmployees)
    println(generalSalary)
    println(averageSalary)
}