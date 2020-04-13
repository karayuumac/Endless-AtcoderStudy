package AOJ.ITP1

/**
 * @author karayuu
 */
fun main(args: Array<String>) {
    val (W, H, x, y, r) = readLine()!!.split(" ").map { it.toInt() }

    val x_m = x - r
    val x_M = x + r
    val y_m = y - r
    val y_M = y + r

    if  (0 <= x_m && x_M <= W) {
        if (0 <= y_m && y_M <= H) {
            println("Yes")
            return
        }
    }
    println("No")
}