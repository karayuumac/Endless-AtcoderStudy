package ABC122

import kotlin.math.max

/**
 * @author karayuu
 */
fun main(args: Array<String>) {
    val s = readLine()!!
    var length = 0
    var count = 0
    for (c in s) {
        if (c in "ACGT") {
            count++
        } else {
            length = _max(length, count)
            count = 0
        }
    }
    length = _max(length, count)


    println(length)
}

fun _max(a: Int, b: Int): Int {
    return if (a >= b) a else b
}