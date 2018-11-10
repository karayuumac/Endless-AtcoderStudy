package Atcoder蟻本.過去問厳選

/**
 * Created by karayuu on 2018/09/26
 */
fun main(args: Array<String>) {
    val a = readLine()!!.toInt()
    val (b, c) = readLine()!!.split(" ").map { it.toInt() }
    val s = readLine()!!

    println("${a + b + c} $s")
}
