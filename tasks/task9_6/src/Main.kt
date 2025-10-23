import java.io.File
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.isEmpty()) {
        println("Usage: please provide a filename.")
        return
    }

    val filename = args[0]

    val result = runCatching {
        val data = readData(filename)
        val varValue = variance(data)
        println("Dataset size: ${data.size}")
        println("Variance: %.5f".format(varValue))
    }

    result.onFailure { e ->
        println("Error: ${e.message}")
        exitProcess(1)
    }
}
