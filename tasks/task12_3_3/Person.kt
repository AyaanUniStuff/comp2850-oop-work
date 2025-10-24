// Task 12.3.2: Person class, with a secondary constructor
import java.time.LocalDate

class Person(var name: String, val birth: LocalDate) {
    var isMarried = false
    constructor(name: String, birthString: String) : this(name, LocalDate.parse(birthString))

    init{
        require(name.isNotBlank()) {"Name can not be blank"}
    }
}

fun main(){
    println("Enter your name:")
    val name = readln()

    println("Enter your DOB:")
    val dob = readln()

    val p = Person(name, dob)
    println(p.name)
    println(p.birth)
}