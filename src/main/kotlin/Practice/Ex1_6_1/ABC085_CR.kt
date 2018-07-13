package Practice.Ex1_6_1

/**
 * @author karayuu
 */
fun main(args: Array<String>) {
    val (n, y) = readLine()!!.split(" ").map { it.toInt() }
    for (i in 0..n) {
        if (i * 10000 > y) {
            /* 10000の位 */
            continue
        }
        for (j in 0..n) {
            if (i * 10000 + j * 5000 > y) {
                continue
            }
            val remaining = y - (i * 10000 + j * 5000)
            val k = remaining / 1000
            if (i + j + k == n) {
                print("$i $j $k")
                return
            }
        }
    }
    print("-1 -1 -1")
}