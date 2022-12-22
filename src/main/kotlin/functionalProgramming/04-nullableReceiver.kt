
fun main () {
    /*
    * kita bisa juga mendeklarasikan sebuah extension dengan nullable receiver type
    * extension tersebut bisa dipanggil pada objek yang bahkan nilainya null
    * biasanya digunakan ketika mempunyai sebuah objek yang bernilai null.
      Saat kita tidak menetapkannya dengan nullable receiver type,
      maka kita perlu memeriksa apakah objek tersebut bernilai null atau tidak
    */

    val value: Int? = null
    println(value.slice)

    val value2: Int? = null
    println(value2.slice2)
}

val Int?.slice: Int
    get() = if (this == null) 0 else this.div(2)
/*
    If expression pada contoh di atas adalah untuk memeriksa apakah receiver object-nya bernilai null.
    Jika tidak bernilai null, maka receiver object tersebut akan secara otomatis di-casting menjadi tipe non-null,
    sehingga kita bisa menggunakan nilainya.
*/

// Selain menggunakan if expression, kita juga bisa menggunakan elvis operator
val Int?.slice2: Int
    get() = this?.div(2) ?: 0