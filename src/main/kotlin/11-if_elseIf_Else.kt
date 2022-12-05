

fun main() {

    /*
    * if -> salah satu kata kunci untuk percabangan
    * percabangan -> mengeksekusi kode tertentu sesuai kondisi yang terpenuhi
    * blok if akan dieksekusi jika kondisi if bernilai true
    */
    val value = 78  
    if( value >= 50) {
        println("Good job")
    }
    /*
    * else -> kata kunci percabangan yang di eksekusi ketika if bernilai false
    */
    if (value == 80) {
        println("Good Job")
    } else {
        println("Nice try")
    }
    /*
    * else if -> kata kunci yang digunakan unutk beberapa kondisi
    * else if akan dieksekusi ketika kondisi booleannya true
    */

    if (value <= 100 && value >= 90) {
        println("Good Job")
    } else if(value <= 89 && value >= 70){
        println("Nice Try 1")
    } else if(value <= 69 && value >= 50) {
        println("Nice try 2")
    } else {
        println("Try Again")
    }
}