

fun main() {
    /*
    * Array -> tipe data yang berisikan kumpulan data dengsn tipe data yang sama (array kotlin hanya bisa menampung kumpulan tipe data yang sama)
    * Tipe data di Array di representasikan dengan kata kunci "Array"
    * index Array dimulai dari 0, 1, 2, 3 dst
    * Array di kotlin tidak dinamis (mirip di java)
    */

    val names: Array<String> =  arrayOf(
        "Yus",
        "man",
        "Yusman",
    )

    println(names.size) // akses panjang isi array
    println(names[0]) // akses index dalam Array
    println(names.get(1)) // akses index dalam Array
    names.set(2, "Elon Musk") // ubah data di posisi index
    println(names[2])

    /*
    * Secara standart Array di kotlin tidak boleh null
    * jika ingin membuat Array null bisa menggunakan " ? " dan wajib diisi panjangnya
    */
    val numbers: Array<Int?> = arrayOfNulls( 3)
    numbers.set(0, 11)
    numbers.set(1, 12)
    numbers.set(2, null)

    println("\n${numbers[0]}")
    println(numbers[1])
    println(numbers[2])
}