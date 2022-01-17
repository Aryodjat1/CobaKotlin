fun main() {

    // Operasi Array
    val members: Array<String> = arrayOf("Aryo", "Erina", "Ryona")
    val eko: String = members[0]
    val joko: String = members.get(1)
    val budi: String = members.get(2)

    members.set(0, "Egun")
    val egun: String = members[0]

    println("$eko $joko $budi $egun")
}