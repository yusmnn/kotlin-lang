fun main() {
    println("\nTipe Number:")
    var age: Byte = 127
    var height: Short = 3000
    var distance: Int = 300
    var balance : Long = 100_000_000L

    println("Byte   = ${age}")
    println("Short  = ${height}")
    println("Int    = ${distance}")
    println("Long   = ${balance}")
    /*
    // Byte = 8 bits -> -128 - 127
    // Short = 16 bits -> -32768 - 32767
    // Int = 32 bits -> -2.147.483.648 (-2^31) - 2,147,483,647(2^31-1)
    // Long = menggunakan L di akhir digit -> 64 bits -> -9.223.372.036.854.775.808 (-2^63) - -9.223.372.036.854.775.808 (2^63-1)
    // underscore '_' untuk mempermudah pembacaan digit angka
    */


    println("\nTipe decimal:")
    var phi: Float = 3.141592F
    var phi2: Double = 3.14159265358979
    println("FLoat = ${phi}")
    println("Double = ${phi2}")
    /*
    // Float = 32 bits -> 6-7 decimal digits -> menggunakan F di akhir digit
    // Double = 64 bits -> 15-16 decimal digits (paling sering digunakan)
    */

    println("\nTipe Literals:")
    var decimalLiterals: Int = 100
    var hexaDecimalLiterals: Int = 0xfdacbad
    var binaryLiterals: Int = 0b0001011101

    println("decimal literal ${decimalLiterals}")
    println("hexadecimal Literal = ${hexaDecimalLiterals}")
    println("binary literal = ${binaryLiterals}")
    /*
    // Literal = format angka lainnya misalnya: hexadedsimal untuk warna, binary untuk matematika
    */

    println("\nKonversi Tipe Data:")
    var numberInt: Int = 50_000

    var conversionByte: Byte = numberInt.toByte() // overflow
    var conversionShort: Short = numberInt.toShort() // overflow
    var conversionInt: Int = numberInt.toInt()
    var conversionLong: Long = numberInt.toLong()
    var conversionFloat: Float = numberInt.toFloat()
    var conversionDouble: Double = numberInt.toDouble()
    println(conversionByte)
    println(conversionShort)
    println(conversionInt)
    println(conversionLong)
    println(conversionFloat)
    println(conversionDouble)

    /*
    // konversi tipe data number = memaksa melakukan perubahan tipe. ex: Int ke Double
    // bila mengkonversi tipe data number ke bawah maka akan mengalami overflow
    */
}