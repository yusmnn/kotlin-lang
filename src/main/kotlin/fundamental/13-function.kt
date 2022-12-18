

fun main() {
    val user = setUser("Yusman", 20)
    println(user)

    val item = setItem("Computer", 11)
    println(item)

    setPlace("Pinrang")
    setPlace2("Makassar")
}

/*
    * function -> prosedure yang memiliki keterkaitan dengan pesan dan object
    * deklarasi function menggunakan kata kunci -> fun
    * sebuah fungsi dapat digunakan untuk mengembalikan nilai
    * kembalian nilai menggunakan kata kunci -> return
*/

fun setUser (nameUser: String, ageUser: Int): String {
    return "Your name is $nameUser, and you $ageUser years old"
}

/*
    * Jika di dalam suatu fungsi hanya memiliki satu expression untuk menentukan nilai kembalian,
    * maka fungsi tersebut bisa diubah menjadi expression body.
*/

fun setItem(nameItem: String, totalItem: Int) = "Your item is $nameItem, and totalItem = $totalItem"

/*
    * function yang tidak mengembalikan nilai dapat menggunakan kata kunci Unit sebagai kembaliannya
*/

fun setPlace(namePlace: String): Unit {
    println("Your place: $namePlace")
}

// kita dapat menghilangkan kata kunci Unit karena kotlin dapat membacanya sebagai tipe kembalian redundant
fun setPlace2(namePlace: String) {
    println("Your second place: $namePlace")
}