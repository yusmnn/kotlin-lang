

fun main() {
    val openOffice = false
    val now = true
    // contoh if sebagai statement:
    if (openOffice == now) {
        println("Office already open")
    } else {
        println("office close")
    }
    /*
    * If pada bahasa Kotlin juga bisa digunakan sebagai expression.
    * Yang dimaksud dengan expression adalah statement yang dapat mengembalikan nilai
    * dan bisa kita simpan ke dalam sebuah variabel
    */
    // if sebagai expression:
    val office = if (openOffice == now ) "Office already open" else " office close"
    println(office)

    /*
    * di dalam sebuah expression juga bisa terdapat sebuah expression lagi.
    */
    tambah(2 ,4)

}
fun tambah( value1: Int , value2: Int) {
 println(value1 + value2)
}