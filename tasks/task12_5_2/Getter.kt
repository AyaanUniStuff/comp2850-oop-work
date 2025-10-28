// Task 12.5.2: class with a custom getter

import java.time.LocalDate

class Person(var _name: String, val birth: LocalDate) {
    var isMarried = false

    var name = _name
    get() {
        return field.uppercase()
    }
} 

fun main(){
    val p = Person("ayaan",  birth=LocalDate.of(1992, 8, 23))
    println(p.name)

}
