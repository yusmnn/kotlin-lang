
fun main() {
    /*
    * vararg -> menyederhanakan beberapa parameter yang memiliki tipe data yang sama menjadi parameter tunggal.
    * vararg di fungsi dapat memiliki jumlah parameter berdasarkan jumlah argumen yang kita masukkan ketika fungsi tersebut dipanggil
    * di dalam sebuah fungsi, tidak diizinkan untuk memiliki 2 (dua) parameter bertanda vararg
    * parameter yang ditandai dengan vararg sebaiknya berada pada posisi terakhir.
    */
    val number = sumNumbers(12,13,456,23,45) // karena tipe datanya sama jadi bisa digabung(tunggal)
    println(number)

    val list = asList("yuss", 1,100,'A')
    println(list)

    val sets = sets("Kotlin", 1,3,4)
    println(sets)
}

fun sumNumbers(vararg number: Int):Int {
    return number.sum()
}

// Ketika sebuah parameter ditentukan dengan vararg, pada dasarnya semua argumen yang dilampirkan, ditampung di dalam sebuah Array <out T>.
fun <T> asList(vararg input: T): List<T> {
    val result = ArrayList<T>()
    for (item in input)
        result.add(item)
    return result
}

fun sets(name: String, vararg number: Int): String {
   return "$name ${number.toSet()}"
}
