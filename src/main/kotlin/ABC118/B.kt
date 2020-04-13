package ABC118

/**
 * @author karayuu
 */
fun main(args: Array<String>) {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    val result = arrayOfNulls<Int>(m)
    for (i in 1..m) {
        result[i - 1] = 0
    }

    while (true) {
        val list = readLine()!!.split(" ").map { it.toInt() }
        if (list.isEmpty()) {
            break
        }
        val new = list.drop(1)
        new.forEach { result[it - 1]!!.plus(1) }
    }

    var count = 0

    for (i in 1..m) {
        if (result[i - 1] == n) {
            count++
        }
    }
}