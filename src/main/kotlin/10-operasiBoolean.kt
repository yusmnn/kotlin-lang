

fun main () {

    /*
    * operasi Boolean -> menggabunngkan dua nilai boolean
    */

    println("\nOperasi && -> AND")
    var isOption: Boolean

    isOption= true && true
    println(isOption)

    isOption= false && true
    println(isOption)

    isOption= true && false
    println(isOption)

    isOption= false && false
    println(isOption)

    println("\nOperasi || -> OR")

    isOption= true || true
    println(isOption)

    isOption= false || true
    println(isOption)

    isOption= true || false
    println(isOption)

    isOption= false || false
    println(isOption)

    println("\nOperasi ! -> NEGASI")
    val i = true
    val j = false
    println("i true -> ${!i}")
    println("j false -> ${!j}")




}