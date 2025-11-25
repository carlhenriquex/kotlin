class Customer

Class Contact(val id: Int, var email: String)

fun main() {
    val customer = Customer()

    val contact = Contact(1, "carl@gmail.com")

    println(contact.id)
    contact.email = "carl@hotmail.com"
}