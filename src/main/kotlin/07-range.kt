

fun main() {
    /*
    * range -> tipe data semacam array yang berurutan isi datanya, terdapat urutan nilai (awal - akhir)
    * biasanya dipakai di perulangan atau  for loops
    * data di range tidak bisa diakses seperti array
    * range tidak digunakan unutk menampung data
    * * range dengan step, ex: 0..10 step 2
    */
    val range = 0..10 step 2
    val range2 = 1..11
    println(range.step) //  mendapatkan nilai tiap kenaikan 2
    println(range2)

    val number = 1..100

    println(number.count()) // mendapatkan total data range
    println(number.contains(0)) // cek value 0 apakah ada di range
    println(number.contains(1)) // cek value 1 apakah ada di range
    println(number.first) // mendapatkan nilai pertama
    println(number.last) // mendapatkan nilai terakhir
    println(number.step) // mendapatkan nilai tiap kenaikan

    /*
    * range terbalik, ex: 100 ke 1
    * tidak menggunakan " .. " tapi downTo

    */
    val number2 = 1000 downTo 10 step 2
    println(number2.count()) // mendapatkan total data range
    println(number2.contains(666)) // cek value 666 apakah ada di range
    println(number2.first) // mendapatkan nilai pertama
    println(number2.last) // mendapatkan nilai terakhir
    println(number2.step) // mendapatkan nilai tiap kenaikan



}
