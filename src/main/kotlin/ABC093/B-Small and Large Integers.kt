package ABC093

/**
 * @author karayuu
 */

fun main(args: Array<String>) {
    val (a, b, k) = readLine()!!.split(" ").map { it.toInt() }

    val one = (0 until k).map {
        a + it
    }

    val two = (0 until k).map {
        b - it
    }

    val r = (one + two).toSortedSet()

    for (i in r) {
        if (i in a..b) println(i)
    }
}