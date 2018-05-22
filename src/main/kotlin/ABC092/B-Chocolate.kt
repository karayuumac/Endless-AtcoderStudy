package ABC092

/**
 * @author karayuu
 */
fun main(args: Array<String>) {
    val people = readLine()!!.toInt()
    val (day, x) = readLine()!!.split(" ").map { it.toInt() }

    (1..people).map {
        ( (day - 1) / readLine()!!.toInt() ) + 1
    }.sum().let { println(it + x) }
}