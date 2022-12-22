
fun main() {
    /*
    * Kotlin mendukung 2 (dua) extension yang dapat digunakan, yaitu Extension Functions dan Extension Properties.
    * extension functions digunakan untuk menambahkan fungsi baru
    * extension properties digunakan untuk menambahkan sebuah properti baru
    */

    // extension functions
    10.printInt()
    println(10.plusThree())

    // Extension Properties
    println(10.slice)
}

/* extension functions */
fun Int.printInt() {
    println("value $this")
}
// Int pada kode di atas digunakan sebagai receiver type,
// this adalah receiver type yang bertindak sebagai objeknya

// bisa juga menetapkan jika extension functions tersebut dapat mengembalikan nilai
// extension properties hanya bisa dideklarasikan dengan cara menyediakan getter atau setter secara eksplisit
fun Int.plusThree(): Int {
    return this + 3
}

/* Extension Properties */
val Int.slice: Int
    get() = this / 2

