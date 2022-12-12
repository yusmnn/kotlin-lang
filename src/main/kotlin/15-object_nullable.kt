

fun main() {
    /*
    * safe calls operator (?.) -> menjamin kode yang ditulis aman dari nullPointerException
    * Dengan safe call, kompiler akan melewatkan proses jika objek tersebut bernilai null.
    */
    val text: String? = null
    println(text?.length)

    /*
    * elvis operator (?:) -> menetapkan default value atau nilai dasar jika object bernilai null
    */
    val name: String? = null
    val nameLength = name?.length ?: 0
    println(nameLength)

}