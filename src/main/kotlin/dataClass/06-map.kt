

fun main() {

    /*
    * map -> collection yang dapat menyimpan data dengan foramt key-value.
    * to adalah sebuah key, sedangkan yang di sebelah kanan merupakan value-nya.
    */

    val city = mapOf(
        "jakarta" to "Indonesia",
        "London" to "England",
        "New delhi" to "India"
    )
    println(city["jakarta"])
    println(city.getValue("London"))

    val mapKey = city.keys // menampilkan key apa saja yang berada di dalam map
    println(mapKey)
    val mapvalue = city.values //menampilkan value apa sdaja yang berada di dalam map
    println(mapvalue)

    /*
    * Untuk menambahkan key-value ke dalam map, kita perlu memastikan bahwa map yang digunakan adalah mutable.
    * menggunakan mutable collection itu tidak disarankan.
    * Apabila terdapat sebuah mutable collection yang diubah oleh lebih dari 1 proses, hasil nya akan sulit untuk diprediksi.
    */

    val mutableCity = city.toMutableMap() // ubah map city menjadi mutable
    mutableCity.put("Amsterdam", "netherlands") // menambahkan key-value baru menggunakan fungsi put()
    println(mutableCity)
}