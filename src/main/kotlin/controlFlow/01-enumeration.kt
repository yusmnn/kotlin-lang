

fun main() {
    /*
    * enumeration -> fitur yang digunakan untuk menyimpan kumpulan object yang telah di defenisikan menjadi tipe data konstanta.
    * biasanya digunakan untuk meminimalisir kesalahan dalam pengetikan nilai variable.
    */

    // jika tidak menggunakan enum:
    val colorRed = 0xff0000
    val colorGreen = 0xff0000
    val colorBlue = 0x0000FF

    // akses object di class enum:
    val colorRed1 = Color.RED
    val colorGreen1 = Color.GREEN
    val colorBlue1 = Color.BLUE

    // akses atribut atau method
    val color1 : Color1 = Color1.WHITE
    println("$color1")

    /*
    * enum juga memiliki synthetic method untuk mendapatkan daftar object enum dan nama dari tiap enum
    */
    val colors : Array<Color> = Color.values() // Untuk mendapatkan daftar objek Enum kita bisa menggunakan fungsi values().
    println("\nsynthetic method akses object color:")
    colors.forEach {color ->
        println("$color")
    }

    val color2: Color = Color.valueOf("GREEN")  // untuk mendapatkan nama dari objek Enum kita bisa menggunakan fungsi valueOf()
    println("\nColor is $color2")
    println("Color value is ${color2.value.toString(16)}")

    // mendapatkan daftar objek Enum dan nama dari objek Enum dengan cara yang lebih umum
    // Caranya, gunakan fungsi enumValues() dan fungsi enumValueOf()
    val colors2: Array<Color> = enumValues()
    println("\nmendapatkan daftar object dan nama enum: ")
    colors.forEach {color ->
        println(color)
    }
    val color3: Color = enumValueOf("RED")
    println("Color is $color3")

    // mendapatkan posisi tiap objek menggunakan properti ordinal
    val color4 : Color = Color.BLUE
    println("\nakses posisi tiap objek using properti ordinal:")
    println("Position $color4 is ${color4.ordinal}")

    //  mengecek instance dari Enum itu sendiri dengan menggunakan When Expression
    val whenColor: Color = Color.GREEN
    println("\ninstance enum when expression:")
    when (whenColor) {
        Color.BLUE -> println("Color is $whenColor")
        Color.RED -> println("Color is $whenColor")
        Color.GREEN -> println("Color is $whenColor")
    }
}

/*
* mendefinisikan class enumeration menggunakan kata kunci enum
* setiap object dipisahkan dengan tanda koma " , "
* object yang berada di enum secara implisit bersifat static dan final (tidak dapat diubah setelah dideklarasikan)
*
*/
enum class Color(val value: Int) {
    RED(0xff0000){
       override fun printValueColor() { // pendeklarasian anonymous class
        println("value of Red is ${RED}")
       }
    },
    GREEN(0xff0000){
        override  fun printValueColor() { // pendeklarasian anonymous class
            println("value of Green is ${GREEN}")
        }
    },
    BLUE(0x0000FF){
        override fun printValueColor() { // pendeklarasian anonymous class
            println("value of Blue is ${BLUE}")
        }
    };

    abstract fun printValueColor()
}

/*
* object yang telah didefenisikan menjadi tipe data enum dapat mengakses atribut atau method,
* yang ada didalam class enum
*/
enum class Color1 {
    WHITE,
    BROWN,
    GREY,
}