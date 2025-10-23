// Task 5.1.1: anagram checking using a function
fun main() {
    print("Enter the first word: ")
    val first = readln()
    
    print("Enter the second word: ")
    val second = readln()

    if (first anagramOf second) {
        println("The words are anagrams.")
    } else {
        println("The words are not anagrams.")
    }
}

infix fun String.anagramOf(other: String): Boolean {
    if (this.length != other.length) {
        return false
    }
    val firstChars = this.lowercase().toList().sorted()
    val secondChars = other.lowercase().toList().sorted()
    return firstChars == secondChars
}