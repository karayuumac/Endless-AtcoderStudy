package AtcoderBigginersSelection

/**
 * Created by karayuu on 2018/11/10
 */
fun main(args: Array<String>) {
    val input = readLine()!!.split("").map { it.toInt() }
    println(input.count { it == 1 })
}
