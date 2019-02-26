package yukicoder.level1_5

/**
 * Created by karayuu on 2018/11/23
 */
fun main(args: Array<String>) {
    var w = readLine()!!.toDouble()
    var d = readLine()!!.toInt()
    var motivation = 0.0

    while (d >= 1) {
        motivation = w / (d * d)
        w -= Math.floor(motivation)
        d--
    }

    println(Math.floor(motivation).toInt())
}
