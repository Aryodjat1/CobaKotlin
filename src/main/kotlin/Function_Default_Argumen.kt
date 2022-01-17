fun hello(firstName: String, lastName: String = ""){
    println("Hello $firstName $lastName")
}

fun main() {
    hello("Aryo")
    hello("Aryo", "Djati")
}