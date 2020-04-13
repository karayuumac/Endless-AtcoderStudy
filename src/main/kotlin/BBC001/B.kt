package BBC001

/**
 * @author karayuu
 */
fun main() {
    val a = readLine()!!.toInt()
    for (i in 1..360) {
        if (a * i % 360 == 0) {
            println(i)
            return
        }
    }
}