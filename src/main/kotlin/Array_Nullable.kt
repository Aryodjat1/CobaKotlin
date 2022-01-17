fun main() {

    // Array Nullable
    val names: Array<String?> = arrayOfNulls(5)
    names.set(0, "Aryo")
    names.set(1, null)
    names.set(2, "Erina")
    names.set(3, null)
    names.set(4, "Ryona")

    println("${names[0]} ${names[1]} ${names[2]} ${names[3]} ${names[4]}")

}