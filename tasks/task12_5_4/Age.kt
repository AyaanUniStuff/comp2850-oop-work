// Task 12.5.4: class with a computed property
import java.time.temporal.ChronoUnit.YEARS
import java.time.LocalDate

class Person(var name: String, val birth: LocalDate) {
    var isMarried = false
    val age get() = YEARS.between(birth, LocalDate.now()).toInt()
}

fun main(){
    val p = Person("ayaan", birth=LocalDate.of(1992, 8, 23))
    print(p.age)
}

