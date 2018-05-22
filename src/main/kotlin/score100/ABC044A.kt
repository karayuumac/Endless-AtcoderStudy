package score100

/**
 * @author karayuu
 */
fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val k = readLine()!!.toInt()
    val x = readLine()!!.toInt()
    val y = readLine()!!.toInt()

    if (n <= k) {
        print((1..n).sumBy { x })
    } else {
        print((1..k).sumBy { x } + ((k + 1)..n).sumBy { y })
    }
}