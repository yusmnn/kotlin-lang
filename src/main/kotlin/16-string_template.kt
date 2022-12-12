

fun main() {
    /*
    * String template -> fitur yang digunakan untuk menyisipkan,
    * sebuah variable kedalam sebuah string tanpa concatenation ( + )
    */

    val name = "Yusman"
    println("Your name is " + name) // concatenation

    val place = "Pinrang"
    val postalCode = 90233
    println("Your place is $place, postal code $postalCode")

    /*
    * dapat juga menyisipkan sebuah expression ke dalam sebuah string template.
    * Caranya, sisipkan expression ke dalam curly braces yang diikuti karakter $.
    */

    val hour = 12
    println("office ${if (hour == 12 ) "already close" else "is open"}")
}