// Implement the six required functions here
import java.io.File
import kotlin.random.Random

fun isValid(word: String): Boolean {
    return word.length == 5
} 

fun readWordList(filename : String): MutableList<String> = File(filename).readLines().toMutableList()

fun pickRandomWord(words: MutableList<String>): String {
    val index = Random.nextInt(words.size)
    val chosenWord = words[index]
    words.removeAt(index)
    return chosenWord
}

fun obtainGuess(attempt:Int): String {
    while(true){
        print("Attempt $attempt: ")
        val ans = readLine()?: ""

        if (isValid(ans)){
            return ans
        }
        else {
            println("Please enter a 5 letter word")
        }
    }
        
}


fun evaluateGuess(guess: String, target: String): List<Int> {
    val result = mutableListOf<Int>()
 

    for (index in (0..(guess.length - 1))){
        if (guess[index] == target[index]){
            result.add(1)
        }
        else {
            result.add(0)
        }
    }
    return result
}

fun displayGuess(guess: String, matches : List<Int>) {
    for (index in (0..guess.length-1)){
        if (matches[index] == 1){
            print(guess[index])
        }
        else {
            print("?")
        }
        
    }
    println("")
}
 