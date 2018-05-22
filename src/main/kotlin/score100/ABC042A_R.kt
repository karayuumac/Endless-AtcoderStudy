package score100

/**
 * @author karayuu
 */
fun main(args: Array<String>) {
    val input = readLine()!!.split(" ").map { it.toInt() }

    /* list内からある条件に適する物の個数を数えるときはcountを使うと良い */
    val five = input.count { it == 5 }
    val seven = input.count { it == 7 }

    if (five == 2 && seven == 1) {
        println("YES")
    } else {
        println("NO")
    }
}