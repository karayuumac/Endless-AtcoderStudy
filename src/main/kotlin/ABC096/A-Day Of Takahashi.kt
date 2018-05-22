package ABC096

/**
 * @author karayuu
 */
fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }
    var result = a
    if (b < a) result -= 1
    println(result)
}