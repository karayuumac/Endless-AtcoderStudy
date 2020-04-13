package BBC001

/**
 * @author karayuu
 */
fun main() {
    val (h, w) = readLine()!!.split(" ").map { it.toInt() }
    if (h % 2 != 0 && w % 2 != 0) {
        println("No")
    } else {
        println("Yes")
    }
}