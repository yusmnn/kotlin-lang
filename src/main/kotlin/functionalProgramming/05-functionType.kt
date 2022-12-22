




fun main()  {
    /*
    * function type untuk tipe deklarasi yang berhubungan dengan sebuah fungsi.
    * terdapat beberapa tanda yang berhubungan dengan sebuah fungsi seperti jumlah dan tipe parameter serta tipe kembalian.
    * typealias -> Ketika kita mempunyai beberapa fungsi yang memiliki function type yang sama, kita bisa menyederhanakannya.
    * typealias untuk memberikan nama alternatif dari sebuah function type
    */

    // invoke() -> operator untuk menggunakan instance
    val sumResult = sum.invoke(10, 10)
    val multiplyResult = multiply.invoke(20, 20)
    // atau bisa juga ditulis tanpa invoke()
    val sumResult2 = sum(10, 10)
    val multiplyResult2 = multiply(20, 20)

    println(sumResult)
    println(multiplyResult)
    println(sumResult2)
    println(multiplyResult2)

    // function type dengan nullable
    val sumResult3 = sum?.invoke(10,20_000)
    println(sumResult3)
}

/*
    typealias cocok digunakan ketika kita mempunyai sebuah function type yang panjang.
    Dengannya, kita bisa memberikan nama untuk sebuah function type dan menggunakannya sebagai tipe untuk fungsi lainnya.
*/
typealias Arithmetic = (Int, Int) -> Int
val sum: Arithmetic = { valueA, valueB -> valueA + valueB }
val multiply: Arithmetic = { valueA, valueB -> valueA * valueB }

/*
    Kita juga bisa menandai function type sebagai nullable dengan menempatkannya di dalam tanda kurung dan diakhiri dengan safe call
*/

typealias Arithmetic2 = ((Int, Int) -> Int)?
val sum2: Arithmetic = { valueA, valueB -> valueA + valueB }
