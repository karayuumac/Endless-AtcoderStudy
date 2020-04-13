package score100

import java.lang.Math.max


/**
 * @author karayuu
 */
fun main(args: Array<String>) {
    val (a, b, c, d) = readLine()!!.split(" ").map { it.toInt() }
    println(max(a * b, c * d))
}