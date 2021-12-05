
fun main() {

    val change = 4.22

    val text = "change = $ $change"

    println(text)

    val numb = 2

    val text2 = "new change = ${change * numb}"

    println(text2)

    val employee = Employee("Alex", 55)

    val text3 = "Nome = ${employee.name}"

    println(text3)
}