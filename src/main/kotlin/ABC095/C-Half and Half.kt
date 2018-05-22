package ABC095

/**
 * @author karayuu
 */
fun main(args: Array<String>) {
    val (a, b, c, x, y) = readLine()!!.split(" ").map { it.toInt() }

    var a_sum = 0
    var b_sum = 0
    var ab_sum = 0

    if ((a + b) < (c * 2)) {
        a_sum += x
        b_sum += y

        println(a_sum * a + b_sum * b + ab_sum * (c * 2))
    } else {
        val check = mutableListOf<Int>()
        val m = mutableListOf(x, y).min()!!
        ab_sum += m
        when {
            x < y -> b_sum += y - m
            x == y -> {

            }
            else -> a_sum += x - m
        }

        check.add(a_sum * a + b_sum * b + ab_sum * (c * 2))
        val max = mutableListOf(x, y).max()!!

        check.add((2 * c) * max)
        println(check.min())
    }
}