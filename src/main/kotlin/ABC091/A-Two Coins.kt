package ABC091

/**
 * @author karayuu
 */

fun main(args: Array<String>) {
    val (x, y, z) = readLine()!!.split(" ").map { it.toInt() }
    println(
            if (x + y < z) {
                "No"
            } else {
                "Yes"
            }
    )
}