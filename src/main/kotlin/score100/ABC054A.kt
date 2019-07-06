package score100

/**
 * Created by karayuu on 2019/06/17
 */
fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }
    when {
        a == b -> println("Draw")
        a == 1 -> println("Alice")
        b == 1 -> println("Bob")
        a < b -> println("Bob")
        else -> println("Alice")
    }
}
