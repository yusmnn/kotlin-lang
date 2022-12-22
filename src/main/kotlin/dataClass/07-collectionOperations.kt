

fun main() {
    /*
    * filter() dan filterNot() fungsi yang akan menghasilkan list baru dari seleksi berdasarkan kondisi yang kita berikan.
    * Sesuai dengan namanya, untuk mem-filter atau menyaring suatu data dalam sebuah collection
    */
    val numberList = listOf(11,12,13,4,9,24,30)
    val evenList = numberList.filter { it % 2 == 0 }
    println(evenList)
    val notEvenList = numberList.filterNot { it % 2 == 0 }
    println(notEvenList)

    /*
    * map() -> membuat collection baru sesuai perubahan yang akan kita lakukan dari collection sebelumnya.
    */
    val numberList2 = listOf(11,22,33,44,55,1)
    val multipliedBy5 = numberList2.map { it * 5 }
    println(multipliedBy5)

    /*
    * count -> digunakan untuk menghitung jumlah item yang ada di dalam collection.
    */
    val numberList3 = listOf(11,22,33,44,55,1,2,6,8)
    val countList = numberList3.count()
    println(countList)
    val countList2 = numberList3.count { it % 2 == 0 }
    println(countList2)

    /*
    * find() -> mencari item pertama yang sesuai dengan kondisi yang kita tentukan
    * Fungsi find() ini memiliki cara kerja yang sama dengan fungsi firstOrNull().
    * Artinya, jika di dalam collection tidak ditemukan data yang sesuai, maka fungsi akan mengembalikan nilai null
    * Tidak seperti fungsi filter() atau map() yang akan melakukan iterasi terhadap seluruh item,
    * fungsi find() dan firstOrNull() ini akan langsung mengembalikan nilai ketika kondisi terpenuhi.
    * jika ingin mencari item terakhir, gunakan fungsi lastOrNull().
    */
    val numberList4 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val firstOddNumber = numberList4.find { it % 2 == 1 }
    println(firstOddNumber)
    val firstOrNullNumber = numberList4.firstOrNull { it % 2 == 3 }
    println(firstOrNullNumber)
    val lastOrNullNumber = numberList4.lastOrNull { it % 2 == 0 }
    println(lastOrNullNumber)

    /*
    * first() dan last() digunakan untuk menyaring item pertama atau terakhir dari sebuah collection.
    * jika kita menambahkan kondisi padahal kondisi tersebut tidak terpenuhi, maka terjadi Exception!
    */

    val numberList5 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val moreThan10 = numberList5.first { it < 10 }
    println(moreThan10)

    /*
    * sum() khusus hanya bisa digunakan untuk collection yang bertipe angka
    * Fungsi ini akan menjumlahkan setiap data yang ada pada collection.
    */

    val numberList6 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val totalSum = numberList6.sum()
    println(totalSum)

    /*
    * sorted() -> mengurutkan item yang ada di dalam collection.
    */
    val kotlinChar = listOf('k', 'o', 't', 'l', 'i', 'n')
    val ascendingSort = kotlinChar.sorted() // sorted() secara default akan mengurutkan data secara ascending.
    println(ascendingSort)
    val descendingSort = kotlinChar.sortedDescending() //untuk sorting secara descending, kita dapat menggunakan fungsi sortedDescending()
    println(descendingSort)
}