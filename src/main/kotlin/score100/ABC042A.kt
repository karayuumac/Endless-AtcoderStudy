package score100

/**
 * @author karayuu
 */
fun main(args: Array<String>) {
    val m = readLine()!!.split(" ").map { it.toInt() }
    var seven = 0
    var five = 0

    for (i in m) {
        when (i) {
            5 -> five++
            7 -> seven++
        }
    }

    if (seven == 1 && five == 2) {
        println("YES")
    } else {
        println("NO")
    }
}