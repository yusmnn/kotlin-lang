

fun main() {

    // tipe data Int
    val numberInt = 120
    val numberInt2 = 10

    println(numberInt + numberInt2) //penjumlahan
    println(numberInt - numberInt2) //pengurangan
    println(numberInt / numberInt2) //pembagian
    println(numberInt * numberInt2) //perkalian
    println(numberInt % numberInt2) //sisa pembagian
    println( (10 * 2) + (120 / 12) - (14 % 3))

    /*
    * Augmented Assignments:
    * a += hasil -> penjumlahan
    * a -= hasil -> pengurangan
    * a *= hasil -> perkalian
    * a /= hasil -> pembagian
    * a %= hasil -> sisa pembagian
    */
    val price = 12_000
    var total:Double = 10.0

    total += price
    println(total)

    total *= price
    println(total)

    total -= price
    println(total)

    total /= price
    println(total)

    total %= price
    println(total)

    /*
    * Unary Operator:
    * ++ -> bertambah satu
    * -- -> berkurang satu
    * -  -> negative
    * +  -> positive
    * !  -> Boolean kebalikan
    */
    println(++total) // ditambah dulu lalu di print
    println(total++) // diprint dulu lalu ditambah
    println(total)

    println(--total) // dikurang dulu lalu di print
    println(total--) // diprint dulu lalu dikurang
    println(total)

    val i = -1  // bilangan negative
    val j = +1  // by default memang Positive, tidak perlu secara eksplisit

    val isOption = true
    println("\nisOPtion = ${isOption}")
    println("!isOPtion = ${!isOption}")


}