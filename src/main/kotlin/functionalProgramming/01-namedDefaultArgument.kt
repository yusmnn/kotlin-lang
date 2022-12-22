
fun main() {
    val name = getFullName(first = "Elon", middle = "Reeve", last = "Musk") // menggunakan named argument
    println(name)

    val identity = getfullIdentity()
    println(identity)
}


// kita bisa menentukan argumen dari parameter mana yang ingin dilampirkan dengan memanggil nama dari parameter tersebut.
fun getFullName(first: String, middle: String, last: String): String { // fun named argument
    return "My name is $first $middle $last."
}

// menentukan nilai default dari sebuah parameter. Jika kita melewatkan argumen untuk dilampirkan,
// maka nilai default tersebut lah yang akan digunakan.
fun getfullIdentity( name: String = "Yusman", gender: String = "male", age: Int = 20, place:String = "Indonesia" ):String {
    return "\n\t$name \n\t$gender \n\t$age \n\t$place"
}




