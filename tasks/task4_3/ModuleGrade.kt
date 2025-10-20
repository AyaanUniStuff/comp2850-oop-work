import kotlin.system.exitProcess
import kotlin.math.roundToInt

fun main(args: Array<String>){
    if (args.size != 3) {
        println("Error: only 3 inputs allowed")
        exitProcess(1)
    }
    
    var sum = 0.0
    for (i in args) {
        sum += i.toDouble()
    }
        
    var grade = (sum / 3).roundToInt()   
    
    when (grade) {
        in 0..39 -> println("Fail")
        in 40..69 -> println("Pass")
        in 70..100 -> println("Distinction")
    }
}