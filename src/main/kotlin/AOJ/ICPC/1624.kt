package AOJ.ICPC

/**
 * @author karayuu
 */

fun main(args: Array<String>) {
    while (true) {
        val n = readLine()!!.toInt()

        if (n == 0) return

        val map = readLine()!!.split(" ").map { it.toInt() }
        println(map.filter { it <= map.average() }.count())
    }
}