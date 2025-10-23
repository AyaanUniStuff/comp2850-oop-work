// Task 8.3: functions for temperature analysis

typealias Record = Pair<String, Double>

fun fetchData(): List<Record> {
    // Simulated dataset using listOf() and `to` for pairs
    return listOf(
        "London" to 12.4,
        "Manchester" to 10.8,
        "Birmingham" to 11.2,
        "Glasgow" to 9.5,
        "Cardiff" to 13.0,
        "Belfast" to 8.9
    )
}

// Optional helper (you can still compute average inline)
fun averageTemp(data: List<Record>): Double {
    var sum = 0.0
    for (record in data) {
        sum += record.second
    }
    return sum / data.size
}

fun main() {
    val data = fetchData()

    //  Compute average temperature in *one line*
    val average = data.map { it.second }.average()

    //  Find lowest and highest temperatures (one line each)
    val lowest = data.minByOrNull { it.second }
    val highest = data.maxByOrNull { it.second }

    //  Print results
    println("Average temperature: %.2f°C".format(average))
    println("Lowest temperature recorded at ${lowest?.first}: ${lowest?.second}°C")
    println("Highest temperature recorded at ${highest?.first}: ${highest?.second}°C")
}

