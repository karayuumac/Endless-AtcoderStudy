package ABC042

/**
 * @author karayuu
 */
fun main(args: Array<String>) {
    val (n, l) = readLine()!!.split(" ").map { it.toInt() }
    val i = (1..n).map { readLine()!! }.sortedBy { it }.joinToString("")
    println(i)
}