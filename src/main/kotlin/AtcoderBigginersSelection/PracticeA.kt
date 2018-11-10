package AtcoderBigginersSelection

/**
 * Created by karayuu on 2018/11/10
 */
fun main(args: Array<String>) {
    val a = readLine()!!.toInt()
    val (b, c) = readLine()!!.split(" ").map { it.toInt() }
    val s = readLine()!!

    println("${a+b+c} $s")
}
