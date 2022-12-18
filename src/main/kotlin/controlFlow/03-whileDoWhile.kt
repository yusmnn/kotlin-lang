

fun main() {
    /*
    * while -> salah satu perulangan yang ada di kotlin
    * while akan melakukan pengecekan kondisi, jika kondisi bernilai true, maka aka dia akan menjalankan blok while,
    * dan terus diulang sampai blok while bernilai false.
    * While bersifat Entry Controlled Loop. Jika kondisi yang diberikan tidak terpenuhi sejak awal maka proses perulangan tidak akan dijalankan.
    */

    var count = 1
    println("\nwhile looping: ")
    while (count <= 5) {
        println("count = $count")
        count++
    }

    /*
    * do while -> salah satu perulangan yang ada di kotlin
    * Do While bersifat Exit Controlled Loop di mana proses perulangan akan langsung dijalankan di awal.
    * Jika telah selesai, barulah kondisi yang diberikan akan dievaluasi.
    */
    var count2 = 1
    println("\ndo while looping: ")
    do {
        println("count 2 = $count2")
        count2++
    } while (count2 <= 5)
}