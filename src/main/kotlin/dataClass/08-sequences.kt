

fun main() {
    /*
    * Sequence -> collection yang bisa dikategorikan ke dalam lazy evaluation.
    * Jika eager evaluation mengevaluasi seluruh item yang ada pada collection.
    * lazy evaluation hanya akan mengevaluasi  item jika benar-benar diperlukan.
    */
    println("Eager evaluation:")
    val list = (1..1_000).toList()
    list.filter { it % 500 == 0 }.map { it * 2 }.forEach { println(it) }

    /*
    * Pada contoh kode di atas, kita memiliki data collection sejumlah 1000 item,
      kemudian masing-masing data akan disaring berdasarkan angka yang merupakan kelipatan 500 lalu dikalikan 2
      dan akhirnya ditampilkan pada konsol.
    * Dengan eager evaluation atau dikenal dengan horizontal evaluation,
      list akan menyelesaikan proses filter terhadap 1000 data baru
      kemudian melakukan mapping data sampai akhirnya ditampilkan pada konsol.
    * menerapkan lazy atau vertical evaluation maka kita perlu mengubah list menjadi Sequence.
      Caranya sangat sederhana, yaitu dengan memanggil fungsi asSequence()
    */
    println("lazy evaluation:")
    val sequenceNumber = list.asSequence()
    list.asSequence().filter { it % 500 == 0 }.map { it * 2 }.forEach { println(it) }

    println("\nperbedaan pemrosesan eager dan lazy: ")
    println("Eager evaluation:")
    val list2 = (1..4).toList()
    list2.filter {
            println("\tfilter -> $it")
            it % 2 == 0
        }
        .map {
            println("\tmap $it * 2 -> ${it * 2}")
            it * 2
        }
        .first {
            println("\tfirst -> $it")
            it == 4
        }
    println("Lazy evaluation:")
    val list3 = (1..4).toList()
    list3.asSequence().filter {
        println("\tfilter -> $it")
        it % 2 == 0
    }
        .map {
            println("\tmap $it * 2 -> ${it * 2}")
            it * 2
        }
        .first {
            println("\tfirst -> $it")
            it == 4
        }
    
}