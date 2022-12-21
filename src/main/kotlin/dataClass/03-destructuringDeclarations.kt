
data class dataUser(val name: String, val age: Int)

data class introUser(val name: String, val nim: String, val kelas: Char) {
    // kita bisa membuat fungsi di dalam data class:
    fun intro() {
        println("Selamat datang $name di aplikasi e-learning. \n\tNIM Anda adalah $nim \n\tdi kelas $kelas")
    }
}

fun main() {
    /*
    * Destructuring Declaration -> proses memetakan objek menjadi sebuah variabel.
    * Ini bisa dengan mudah kita lakukan pada data class.
    * componentN() yang ada pada data class, bisa menguraikan objek menjadi beberapa properti yang dimilikinya.
    * Fungsi component1() dan component2() dihasilkan sesuai dengan jumlah properti yang ada pada data class tersebut
    * Maka jika sebuah data class memiliki sejumlah N properti, maka secara otomatis componentN() akan dihasilkan.
    */
    val dataUser = dataUser("yusmnn", 20)
    val name = dataUser.component1()
    val age = dataUser.component2()
    println("My name is $name, I am $age years old")

    // Dapat juga membuat beberapa variabel dari objek secara langsung
    val dataUser2 = dataUser(name, age)
    val (name2, age2) = dataUser2
    println("My name is $name2, I am $age years old")

    /*
    * data class bertujuan untuk mengurangi jumlah kode boilerplate yang di tuliskan
    * Ketika mempunyai data yang sangat kompleks, kita juga bisa menerapkan sebuah behaviour di dalam data class.
    */
    print("\n")
    val introUser = introUser("ELon", "1302020001", 'A')
    introUser.intro()
}

