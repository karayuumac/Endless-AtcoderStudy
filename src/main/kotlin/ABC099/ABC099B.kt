package ABC099

/**
 * Created by karayuu on 2018/06/10
 */
fun main(args: Array<String>) {
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }
    val u = b - a - 1
    val small = (1..u).sum()
    print(small - a)
}
