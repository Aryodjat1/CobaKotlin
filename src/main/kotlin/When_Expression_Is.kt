fun main() {

    // when expression in
    val name = "Aryo"
    when (name){
        is String -> println("This is String")
        !is String -> println("This is not String")

    }
}