fun main() {

    // when expression in
    val finalExam = 'A'
    val passValue = arrayOf('A', 'B', 'C')
    when (finalExam){
        in passValue -> println("pass")
        !in passValue -> println("Try Again")

    }
}