package ABC095

/**
 * @author karayuu
 */

fun main(args: Array<String>) {
    val add = readLine()!!.map { it.toString() }.filter { it == "o" }.size
    println(700 + add * 100)
}