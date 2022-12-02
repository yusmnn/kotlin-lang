// pendeklarasian variable const
const val APP: String = "HelloWorld"
const val VERSION = "0.0.0.1"
fun main() {
    /*
    * variable -> tempat untuk menyimpan data
    * deklarasi tipe data opsional
    * kotlin mendukung 2 jenis variable = mutable(bisa diubah) dan immutable(tidak bisa diubah)
    * jika membuat variable mutable menggunkaan kata kunci "var"
    * mutable -> data dapat berubah tapi tipe data tidak bisa berubah
    * jika membuat variable immutable menggunakan kata kunci "val"
    * disarankan dalam pembuatan variable menggunakan variable immutable agar minim kesalahan
    */

    // mutable
    var firstName: String = "Yusman" // cara 1
    var lastName = "Yusss" // cara 2

    println("$firstName $lastName")

    // immutable
    val age: Int = 20
    val height = 167
    // height = 123 *error karena avriable immutable
    println("$age $height")

    /*
    * Nullabel -> Secara standar, variable di kotlin harus di deklarasikan/diinisialisasikan nilainya
    * jika saat membuat variable tidak diberi nilai maka akan error
    * kotlin mendukung variable yang boleh null,
    * untuk membuat variable null menggunkana " ? " setelah tipe datanya, mirip di dart
    * variable bernilai null tidak direkomendasikan
    * bisa digunakan hanya sebagai jalan terakhir misalnya dalam mengakses kode java
    */
    var place: String? = null
    println(place)
    place = "Pinrang"
    println(place?.length)

    /*
    * constant -> variable yang biasanya diakses untuk keperluan global(bisa diakses dimana saja)
    * untuk menandai variable constant biasanya menggunakan UPPER_CASE
    */
    println("Selamat datang di aplikasi ${APP} versi ke ${VERSION}")
}