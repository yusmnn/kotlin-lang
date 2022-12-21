

fun main() {
    /*
    * Set -> sebuah collection yang hanya dapat menyimpan nilai yang unik
    *  Kita bisa mendeklarasikan sebuah Set dengan fungsi setOf.
    */

    val integerSet = setOf(1,2,4,2,1,5) //terdapat angka yang duplikat
    println(integerSet)
    /*
    * Secara otomatis fungsi setOf akan membuang angka yang sama
    * urutan pada Set bukanlah sesuatu yang penting,
    * sehingga apabila kita bandingkan dua Set yang memiliki nilai yang sama dan urutan yang berbeda,
    * akan tetap dianggap sama.
    */
    val setA = setOf(1,2,4,2,1,5)
    val setB = setOf(1,2,4,5)

    println(setA == setB) // cek nilai antar set
    println(100 in setB) // cek nilai di setB

    /*
    * fungsi union dan intersect -> mengetahui gabungan dan irisan dari 2 (dua) buah Set.
    */

    val setC = setOf(1,5,7)
    val union = setA.union(setC)
    val intersect = setA.intersect(setC)

    println(union)
    println(intersect)

    /*
    * pada mutable set kita bisa menambah atau menghapus item namun tidak bisa mengubah nilai seperti di list
    */
    val mutableSet = mutableSetOf("yusmnn", 'A',11,22.7)
    // mutableSet.set(0,"yus") tidak bisa akan error
    mutableSet.add(1000) //menambah item diakhir set
    mutableSet.remove('A') //menghapus item yang memiliki nilai char A
    println(mutableSet)
}