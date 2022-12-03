

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


}