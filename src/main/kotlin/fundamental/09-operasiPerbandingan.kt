

fun main() {
    /*
    * operasi perbandingan -> operasi yang membandingkan dua data atau lebih
    * bisa digunakan di tipe data apa saja: Int, Short, String, Boolean
    * operasi perbandingan hasilnya Boolean (true or false)
    * jika benar maka ture
    * jika salah maka false
    */

    val i = 100
    val j = 111
    var result: Boolean?

    result = i < j  // lebih kecil dari
    println(result)

    result = i > j  // lebih besar dari
    println(result)

    result = i <= j // lebih kecil dari atau sama dengan
    println(result)

    result = i >= j // lebih besar dari atau sama dengan
    println(result)

    result = i == j // sama dengan dari
    println(result)

    result = i != j // tidak sama dengan
    println(result)
}