package score100

/**
 * @author karayuu
 */
fun main(args: Array<String>) {
    val (a, b, c) = readLine()!!.split(" ").map { it.toInt() }

    /* 下手なことせず、総当たりで比較するのが最善 */
    if (a + b == c || a + c == b || b + c == a) {
        print("Yes")
    } else {
        print("No")
    }
}