package introduction


class Customer

class Contact(val id: Int, var email: String)


fun main(args: Array<String>) {

    val customer = Customer()

    val contact = Contact(10, "email")
    println(contact.id)

    contact.email = "New Email"
    println(contact.email)

}

