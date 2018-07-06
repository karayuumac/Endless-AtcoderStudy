package ABC101

/**
 * Created by karayuu on 2018/06/23
 */
fun main(args: Array<String>) {
    val (n, k) = readLine()!!.split(" ").map { it.toInt() }
    print(Math.ceil(n.toDouble() / k.toDouble()).toInt() + 1)
}
