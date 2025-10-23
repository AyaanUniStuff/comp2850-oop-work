// Task 5.3.2: dice rolling simulation
import kotlin.random.Random
fun main(){
    rollDice()
}

fun rollDice(numSides : Int = 6, numDice : Int = 1){
    println("Rolling a d$numSides...")
    for (i in 1..numDice){
        println("This is the $i roll")
        val result = Random.nextInt(1, numSides + 1)
        println("You rolled $result")
        }
    }
   
