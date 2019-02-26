package AtcoderBigginersSelection.Multiple_decision

/**
 * Created by karayuu on 2018/12/08
 */
fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(" ").map { it.toDouble() }
    println(Math.ceil((a + b) / 2).toInt())
}
