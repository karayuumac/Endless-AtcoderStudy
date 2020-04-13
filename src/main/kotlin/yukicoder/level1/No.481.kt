package yukicoder.level1

/**
 * @author karayuu
 */
fun main() {
    val list = readLine()!!.split(" ").map { it.toInt() }

    for (i in 1..10) {
        if (list.indexOf(i) == -1) {
            println(i)
            return
        }
    }
}