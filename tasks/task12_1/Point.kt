import kotlin.math.hypot
class Point(var x: Double, var y: Double){
        fun distance() = hypot(x,y)
        fun distanceTo(other: Point): Double {
            return hypot(x - other.x, y-other.y)
        }
    }

fun main() {
    print("Enter x coordinate: ")
    val xInput = readLine()?.toDoubleOrNull()

    print("Enter y coordinate: ")
    val yInput = readLine()?.toDoubleOrNull()

    if (xInput == null || yInput == null) {
        println("Invalid input. Please enter valid numbers.")
        return
    }

    val p = Point(xInput, yInput)

    println("Distance from origin: %.5f".format(p.distance()))

    val reference = Point(4.5, 7.0)
    println("Distance from (4.5, 7.0): %.5f".format(p.distanceTo(reference)))
}