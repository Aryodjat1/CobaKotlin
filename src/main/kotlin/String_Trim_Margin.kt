fun main(){

    // string trim margin
    var address1: String = """
        |Street not yet done
        |Province Subang
    """.trimMargin()

    var address2: String = """
        >Street not yet done
        >Province Subang
    """.trimMargin(marginPrefix = ">")

    println(address1)
    println(address2)
}