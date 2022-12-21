
class User (val name: String, val age: Int)

// jika mengguankan data class maka otomatis akan mengenerete function yang ada
// misal toString(), equals(), hashCode() dll
data class DataUser(val name: String, val age: Int)

fun main () {
    val user = User("yusmn", 20)
    val dataUser = DataUser("yusmnn", 21)

    println(user)
    print(dataUser)
}