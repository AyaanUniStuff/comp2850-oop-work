fun main() {
    val text = "Hello, World! 123"

    println("String: \"$text\"")

    // Count vowels
    val vowels = text.howMany { it.lowercaseChar() in "aeiou" }
    println("Number of vowels: $vowels")

    // Count uppercase letters
    val upper = text.howMany { it.isUpperCase() }
    println("Number of uppercase letters: $upper")

    // Count digits
    val digits = text.howMany { it.isDigit() }
    println("Number of digits: $digits")

    // Count punctuation
    val punctuation = text.howMany { !it.isLetterOrDigit() && !it.isWhitespace() }
    println("Number of punctuation marks: $punctuation")

    // Count spaces
    val spaces = text.howMany { it.isWhitespace() }
    println("Number of spaces: $spaces")
}



fun String.howMany(include: (Char) -> Boolean): Int {
    var count = 0
    for (character in this) {
        if (include(character)) {
            count += 1
        }
    }
    return count
}