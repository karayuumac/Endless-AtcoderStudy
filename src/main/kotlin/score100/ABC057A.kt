package score100

/**
 * Created by karayuu on 2019/06/17
 */
fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }
    println((a + b) % 24)
}
