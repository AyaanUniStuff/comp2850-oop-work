const val MAX_ATTEMPT = 10

fun main() {
    var attempt = 0
    val words = readWordList("data/words.txt")
    val guessWord = pickRandomWord(words)

    while (attempt < MAX_ATTEMPT) {
        attempt += 1
        var guess = obtainGuess(attempt)
        val matches = evaluateGuess(guess, guessWord)
        displayGuess(guess, matches)

        if (guess == guessWord) {
            println("You win")
            return
        }
    }

    println("You lose")
}
