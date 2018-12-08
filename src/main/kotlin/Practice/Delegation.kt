package Practice

/**
 * @author karayuu
 */
interface Greeter {
    fun greet()
}

object JapaneseGreeter : Greeter {
    override fun greet() {
        println("こんにちは")
    }
}

class Person(greeter: Greeter) : Greeter by greeter

fun main(args: Array<String>) {
    val person = Person(JapaneseGreeter)

    person.greet()

    val greeter: Greeter = person
}