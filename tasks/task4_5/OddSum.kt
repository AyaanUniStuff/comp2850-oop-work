// Task 4.5: summing odd integers with a for loop
fun main(){
    println("Enter a number:")
    val num = readln().toInt()
    var sum = 0

    for (i in 0..num){
        if (i % 2 != 0){
            sum += i
            
        }
    }
    
    println("Odd integers sum to $sum")
}