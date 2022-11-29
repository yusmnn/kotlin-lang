fun main() {
    println("Tipe Data")
    var age: Byte = 127         // 8 bits -> -128 - 127
    var height: Short = 3000    // 16 bits -> -32768 - 32767
    var distance: Int = 300     // 32 bits -> -2.147.483.648 (-2^31) - 2,147,483,647(2^31-1)
    var balance : Long = 100_000_000    // 64 bits -> -9.223.372.036.854.775.808 (-2^63) - -9.223.372.036.854.775.808 (2^63-1)

    println("Byte   = ${age}")
    println("Short  = ${height}")
    println("Int    = ${distance}")
    println("Long   = ${balance}")

}