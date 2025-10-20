// Task 5.2.1: geometric properties of circles
import kotlin.math.PI

fun main() {
    val radius = readDouble("Enter the radius: ")

    val area = circleArea(radius)
    val circumference = circleCircumference(radius)

    println("Area = %.4f".format(area))
    println("Circumference = %.4f".format(circumference))
}

fun circleArea(radius: Double) = PI * radius * radius

fun circleCircumference(radius: Double) = 2 * PI * radius

fun readDouble(prompt: String): Double {
    print(prompt)
    val input = readln()
    return input.toDouble()
}
