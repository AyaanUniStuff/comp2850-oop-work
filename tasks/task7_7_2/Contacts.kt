// Task 7.7.2: contact database, using a map
// Task 7.7.2: simple contacts database
fun main() {
    val contacts = mutableMapOf<String, String>()

    while (true) {
        print("Enter a contact name (or type 'done' to exit): ")
        val name = readln().trim()

        if (name.lowercase() == "done") {
            println("Exiting program.")
            break
        }

        if (name in contacts) {
            println("Phone number for $name: ${contacts[name]}")
        } else {
            print("No number found for $name. Enter phone number: ")
            val number = readln().trim()
            contacts[name] = number
            println("Contact saved.")
        }
    }

    println("\nFinal contacts list:")
    for ((n, num) in contacts) {
        println("$n → $num")
    }
}
