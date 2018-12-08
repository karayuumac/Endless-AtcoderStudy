package AtcoderBigginersSelection

/**
 * @author karayuu
 */
fun main(args: Array<String>) {
    val (a, b, c, x) = (0..3).map { readLine()!!.toInt() }
    var count = 0

    for (i in 0..a) {
        for (j in 0..b) {
            for (k in 0..c) {
                if (x == 500 * i + 100 * j + 50 * k) {
                    count++
                }
            }
        }
    }

    println(count)
}