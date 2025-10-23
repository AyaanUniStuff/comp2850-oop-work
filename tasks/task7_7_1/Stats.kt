// Task 7.7.1: stats for a numeric dataset
fun main(){
    val data = readData()
    displayStats(data)
}

fun readData() = buildList<Float> {
    println("Enter numbers (type 'done' to finish):")
    while (true) {
        val input = readln()
        if (input.lowercase() == "done") break
        add(input.toFloat())
    }
}

fun median(values: List<Float>): Float {
    if (values.isEmpty()) {
        throw IllegalArgumentException("Cannot compute median of an empty list")
    }

    val sorted = values.sorted()
    val mid = sorted.size / 2

    return if (sorted.size % 2 == 0) {
        // even number of elements → average of the two middle values
        (sorted[mid - 1] + sorted[mid]) / 2
    } else {
        // odd number of elements → middle value
        sorted[mid]
    }
}

fun displayStats(values: List<Float>) {
    if (values.isEmpty()) {
        println("No data to display.")
        return
    }

    val min = values.minOrNull()
    val max = values.maxOrNull()
    val mean = values.average().toFloat()
    val med = median(values)

    println("\nStatistics:")
    println("Minimum: $min")
    println("Maximum: $max")
    println("Mean: $mean")
    println("Median: $med")
}