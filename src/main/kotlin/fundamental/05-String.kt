

fun main() {
    /*
    // String = kumpulan dari character sehinga menjadi teks
    // di representasikan menggunakan "String"
    // " " -> untuk penggunaan teks satu baris
    // """  """ -> unutk penggunaan lebih dari satu baris
    */

    var name: String = "Nama Saya adalah Yusman"
    var description: String = """
        |Saya adalah salah satu mahasiswa di UMI, 
        |sedang belajar Kotlin
    """.trimMargin()

    /*
    // trimMArgin() -> function yang digunakan untuk menghapus tab sebelum teks
    // biasanya mengunakan symbol " | " tetapi bisa juga di custom
    */

    var place: String = """
        <Pinrang
        <Sulawesi Selatan
        <Indonesia
    """.trimMargin("<")
    /*
     // pace -> contoh var string multiline dengan custom symbol
    */

    println(name)
    println("\n${description}")
    println("\n${place}")

    /*
     // menggabungkan stringm dapat menggunakan operator +
     // cara menggabungkan string seperti ini tidak disarankan
     // yang disarankan menggunakan string templete yaitu " $ " atau jika kompleks "${}"
    */
    var firstName: String = "Yusman"
    var lastName: String = "Y"
    var fullName: String = firstName + " " + lastName
    var fullName2: String = "$firstName $lastName"
    var lengtgFullName: String = "$fullName lengthnya = ${fullName.length}"
    println("\n$fullName")
    println("$fullName2")
    println(lengtgFullName)

    /*
     // pada dasarnya String merupakan kumpulan Char yang berbentuk Array,
     // sehingga kita bisa mendapatkan karakter tunggal dengan mudah.
    */
    val myname = "Yusman"
    val indexName = myname[0]

    println("Index pertama String myName = $indexName")

    /*
        * escaped String -> mengurangi ambiguitas nilai yang berada didalam string
        * \t: menambah tab ke dalam teks.
        * \n: membuat baris baru di dalam teks.
        * \’: menambah karakter single quote kedalam teks.
        * \”: menambah karakter double quote kedalam teks.
        * \\: menambah karakter backslash kedalam teks.
    */

    val statement = "Kotlin is \"Awesome!\""
    val statement2 = "Kotlin is \tAwesome!"
    val statement3 = "Kotlin is \nAwesome!"
    val statement4 = "Kotlin is \'Awesome!\'"
    val statement5 = "Kotlin is \"Awesome!\""
    val statement6 = "Kotlin is \\Awesome!\\"

    println(statement)
    println(statement2)
    println(statement3)
    println(statement4)
    println(statement5)
    println(statement6)




}