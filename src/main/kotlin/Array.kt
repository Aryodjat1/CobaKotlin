fun main() {

    // membuat Array
    val members: Array<String> = arrayOf("Aryo", "Erina", "Ryona")
    val values: Array<Byte> = arrayOf(80, 90, 85)
    val balance: Array<Int> = arrayOf(20_000, 10_000, 15_000)

    println("1. ${members.get(0)} 2. ${members.get(1)} 3. ${members.get(2)}")
    println("1. ${values.get(0)} 2. ${values.get(1)} 3. ${values.get(2)}")
    println("1. ${balance.get(0)} 2. ${balance.get(1)} 3.${balance.get(2)} ")

}