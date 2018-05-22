package ABC092

/**
 * @author karayuu
 */

fun main(args: Array<String>) {
    val train = (1..2).map { readLine()!!.toInt() }.min()!!
    val bus = (1..2).map { readLine()!!.toInt() }.min()!!

    println(train + bus)
}