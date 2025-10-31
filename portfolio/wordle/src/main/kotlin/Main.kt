fun main() {
    var attempt = 0
    val words = readWordList("data/words.txt")
    val guessWord = pickRandomWord(words)

    while (attempt < 10){
        attempt = attempt + 1

        var guess = obtainGuess(attempt)
        val matches = evaluateGuess(guess, guessWord)
        displayGuess(guess,matches)

        if (guess == guessWord){
            println("You win")
        }
        
    }
    println("You lose")
}

