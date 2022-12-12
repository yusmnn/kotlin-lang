
fun main() {

    /*
    * ika ingin sebuah objek bisa bernilai null, kita bisa menambahkan tanda ? "mirip dart"
    * Namun kita tidak bisa langsung mengakses nilai dari objek yang sudah kita tandai sebagai nullable
    */
    val text : String? = null

    // val textLength = text.length // compile time error

    /*
        * cara mengakses nilai dari objek yang ditandai sebagai nullable? adalah,
        * periksa object tersebut apakah bernilai null atau tidak
    */
    if(text!= null) {
        val textLength = text.length // compile tidak error
    }


}