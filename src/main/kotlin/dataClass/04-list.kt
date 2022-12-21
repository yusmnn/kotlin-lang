

fun main() {
    /*
    * List -> variable untuk menyimpan banyak data menjadi satu object.
    * list mirip dengan array tapi list itu dinamis.
    * list terbagi 2 yaitu: mutable(dapat di manipulasi), immutable(tidak bisa dimanipulasi)
    * kita bisa membuat sebuah List yang berisi sekumpulan data angka, karakter atau yang lainnya.
    */
    //membuat list dengan data yang sama:
    val numberList: List<Int> = listOf(11,12,13,14,15)
    println(numberList)
    val numberList2 = listOf(111,222,333,444,555)
    println(numberList2)

    //membuat list dengan data yang berbeda:
    val customList = listOf(11,'A',"yusmnn",3.14F,132.324, true)
    println("\n$customList")

    val listValue = listOf("yusmnn", 11, 3.14,'Z')
    print("\n")
    println(listValue.isEmpty()) //cek apakah list kosong
    println(listValue.isNotEmpty()) //cek apakah list berisi
    println(listValue[0]) // akses index
    println(listValue.indexOf('Z')) //cek posisi ke berapa data 'Z'
    println(listValue.contains(11)) //cek apakah berisikan data 11
    println(listValue.containsAll(listOf("yusmnn", 3.14, 'Z'))) //cek beberapa data apakah ada di list

    /*
    * mutable list -> list yang dapat dimanipulasi datanya
    * mutable list extend dari list jadi semua function yang ada di list dapat digunakan di mutablelist
    */
    val mutableListValue = mutableListOf(11, "yusmnn") //mutableList datanya boleh kosong dalam pembuatannya
    mutableListValue.add("yus") //hapus elemen ke dalam mutableList
    mutableListValue.set(1,"elon") //ubah elemen sesuai index
    mutableListValue.remove(11) // hapus elemen 11 di dalam mutableList
    println(mutableListValue)


}