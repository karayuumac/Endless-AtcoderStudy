package ABC095

/**
 * @author karayuu
 */

fun main(args: Array<String>) {
    val (n, x) = readLine()!!.split(" ").map { it.toInt() }
    var amount = 0

    val list = mutableListOf<Int>()

    (1..n).forEach { list.add(readLine()!!.toInt()) }

    list.sort()

    val remaining = x - (list.sum())
    amount += n

    amount += (remaining / list.first())

    println(amount)
}