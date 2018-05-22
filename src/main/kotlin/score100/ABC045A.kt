package score100

/**
 * @author karayuu
 */
fun main(args: Array<String>) {
    val (a, b, h) = (1..3).map { readLine()!!.toInt() }
    print(((a + b) * h ) / 2)
}