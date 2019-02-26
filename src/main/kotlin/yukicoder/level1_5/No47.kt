package yukicoder.level1_5

/**
 * Created by karayuu on 2018/11/23
 */
fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    var d = 1
    var count = 0

    while (d < n) {
        d = d.double()
        count++
    }

    println(count)
}

fun Int.double() = this * 2
