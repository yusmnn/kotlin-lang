

fun main() {
    /*
     * Continue -> melewatkan proses iterasi dan lanjut dengan proses iterasi berikutnya.
     * break -> menghentikan proses iterasi
    */

    val listOfInt = listOf(11,12,13,null,15,null,17)
    for (i in listOfInt) {
        if ( i == null) { // cek apakah null, jika null akan di skip
            continue
        }
        print("$i, ")
    }

    val listOfInt2 = listOf(11,12,13,null,15,null,17)
    print("\n")
    for (i in listOfInt2) {
        if ( i == null) { // cek apakah null, jika null akan berhenti
            break
        }
        print("$i, ")
    }

    /*
    *Pada Kotlin, sebuah expression dapat ditandai dengan sebuah label.
    * Label pada Kotlin memiliki sebuah identifier yang diikuti dengan tanda @.
    * Contoh dari sebuah label adalah foo@ atau bar@.
    */
    print("\n")
    loop@ for (i in 1..10){
        println("outside loop")

        for (j in 1..10){
            println("inside loop")
            if(j > 4){
                break@loop  // break yang sudah ditandai dengan label akan dilompati ke titik awal proses perulangan yang sudah ditandai dengan label "@".
            }
        }
    }
}