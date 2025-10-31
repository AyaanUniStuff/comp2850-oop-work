import io.kotest.matchers.collections.shouldContain
import io.kotest.matchers.collections.shouldNotContain
import io.kotest.assertions.withClue
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import java.io.File

@Suppress("unused")
class WordleTest : StringSpec({
    "Boolean of Value true for words with length of 5" {
        withClue("Word=slate") { isValid("slate") shouldBe true }
        withClue("Word=hole") { isValid("hole") shouldBe false }
        withClue("Word=number") { isValid("number") shouldBe false }
    }

    "readWordList should return a mutable list of words" {
        val tempFile = File.createTempFile("wordlist", ".txt")
        tempFile.writeText(
            """
            slate
            hole
            number
            """.trimIndent()
        )

        val words = readWordList(tempFile.absolutePath)
        withClue("File contained: slate, hole, number") {words shouldBe mutableListOf("slate", "hole", "number")}
        tempFile.deleteOnExit()
    }

    "pickRandomWord removes item from array and return it"{
        val words = mutableListOf("slate", "hole", "number")
        val size = words.size
        val chosenWord = pickRandomWord(words)

        withClue("Return word from orignal list") {listOf("slate", "hole", "number") shouldContain chosenWord}
        withClue("Returned word should not be in list anymore") {words shouldNotContain chosenWord}
        withClue("List should have one less element") {words.size shouldBe (size - 1)}
        
    }

    "evaluateGuess should return 1 for letters that are the same as target else 0 "{
        withClue("Word = slate") {evaluateGuess("slate", "slate") shouldBe listOf(1,1,1,1,1)}
        withClue("Word = rapid") {evaluateGuess("rapid", "ralid") shouldBe listOf(1,1,0,1,1)}
        withClue("Word = ayaan") { evaluateGuess("ayaan", "eqskc") shouldBe listOf(0,0,0,0,0)}
    }

})
