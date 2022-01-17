fun main(){

    // nullable variable
    var firstName: String? = "Aryo Djati"
    firstName = null

//    //error karena firstName bisa null
//    println(firstName.length)

    //cara mengakses yang benar
    println(firstName?.length)


}