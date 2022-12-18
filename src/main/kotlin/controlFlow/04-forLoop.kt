

fun main() {
    /*
    * for -> konsep perulangan yang ada di kotlin
    * for dapat digunakan pada Ranges, Collections, Arrays dan apapun yang menyediakan iterator.
    * index pada ranges -> merupakan indeks dari tiap nilai
    * value pada ranges yang merupakan nilai tunggal yang dicakup oleh ranges itu sendiri.
    */
    val ranges = 1..5
    for (i in ranges) {
        println("ranges is $i")
    }

    // for loop dengan range expression
    print("\n")
    val ranges2 = 1.rangeTo(5)
    for (j in ranges2) {
        println("ranges 2 is $j")
    }
    print("\n")
    val ranges3 = 0.rangeTo(10) step 2
    for (i in ranges3) {
        println("ranges 3 is $i")
    }

    // Akses indeks untuk setiap elemen pada Ranges dengan fungsi withIndex()
    print("\n")
    val ranges4 = 1.rangeTo(5)
    for ((index, value) in ranges4.withIndex()) {
        println("value $value with Index $index")
    }

    // forEach lambda expression yang hanya memiliki satu argumen nilai tunggal yang dicakup pada ranges.
    print("\n")
    val ranges5 = 1.rangeTo(10) step 3
    ranges5.forEach { value ->  // hanya satu argumen yaitu value
        println("value is $value")
    }


    // jika kita mendapatkan indeks dari tiap nilai yang dicakup bisa menggunakan ekstensi forEachIndexed
    print("\n")
    val ranges6 = 1.rangeTo(10) step 3
    ranges6.forEachIndexed{index, value ->  // dua argumen index & value
        println("value $value with index $index")
    }

    // jika hanya ingin menggunakan argumen index, maka bisa ubah argumen value menjadi _ (disarankan)
    print("\n")
    val ranges7 = 1.rangeTo(10) step 3
    ranges7.forEachIndexed{index, _ ->  // dua argumen index & _
        println("Index $index")
    }
}