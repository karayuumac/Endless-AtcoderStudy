package score100

/**
 * @author karayuu
 */
fun main(args: Array<String>) {
    val (a, op, b) = readLine()!!.split(" ").map { it }
    val _a = a.toInt()
    val _b = b.toInt()

    if (op == "+") {
        println(_a + _b)
    } else {
        println(_a - _b)
    }
}