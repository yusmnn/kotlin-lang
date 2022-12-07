

fun main() {
    /*
    * when -> salah satu kata kunci unut percabangan
    * when mirip dengan switch case di bahasa pemrograman lain
    * when biasanya digunakan untuk pengecekan kondisi dalam satu variable
    */

    val i = "b"

    when (i) {
        "a" -> println("Huruf A")
        "b" -> {
            println("Huruf B")
            println("Jika blok lebih dari 1 baris gunakan kurung kurawal")
        }
        "c" -> {
            println("Huruf C")
        }
        else -> println("Huruf salah")
    }

    /*

    */
}